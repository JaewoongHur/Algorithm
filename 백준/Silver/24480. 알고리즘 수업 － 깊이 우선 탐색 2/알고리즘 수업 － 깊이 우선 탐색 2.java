import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int N,M,R,idx;
	static List<List<Integer>> list = new ArrayList<>();
	static boolean[] visit;
	static int[] order;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.get(a).add(b);
			list.get(b).add(a);			
		}
		
		visit = new boolean[N+1];
		
		for(int i=1;i<=N;i++) {
			Collections.sort(list.get(i),Collections.reverseOrder());
		}
		
		order = new int[N+1];
		idx = 0;
		dfs(R);
		
		for(int i=1;i<=N;i++) {
			sb.append(order[i]).append('\n');
		}
		System.out.println(sb);
	}
	
	private static void dfs(int num) {
		visit[num] = true;
		order[num] = ++idx;
		
		for(int x : list.get(num)) {
			if(!visit[x]) {
				dfs(x);
			}
		}
	}
	
}