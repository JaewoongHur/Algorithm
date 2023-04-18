import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer>[] list = new ArrayList[N+1];
		boolean[] visit = new boolean[N+1];
		
		for(int i=0;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i=1;i<=N;i++) {
			Collections.sort(list[i], Collections.reverseOrder());
		}
			
		int[] order = new int[N+1];
		
		Queue<Integer> q = new LinkedList<>();
		q.add(R);
		visit[R] = true;
		int idx = 1;
		order[R] = idx;
		

		
		while(!q.isEmpty()) {
			int p = q.poll();
			int k = list[p].size();
			
			for(int i=0;i<k;i++) {
				int s = list[p].get(i);
				if(!visit[s]) {
					visit[s] = true;
					q.add(s);
					idx++;
					order[s] = idx;
				}
			}
		}
		for(int i=1;i<=N;i++) {
			sb.append(order[i]).append('\n');
		}
		System.out.println(sb);
	}
}