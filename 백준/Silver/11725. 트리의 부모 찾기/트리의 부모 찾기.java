import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] parent;
	static ArrayList<Integer>[] tree;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		parent = new int[N+1];
		visit = new boolean[N+1];
		
		tree = new ArrayList[N+1];
		for(int i=0;i<=N;i++) {
			tree[i] = new ArrayList<>();
		}
		
		for(int i=0;i<N-1;i++) {
		st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			tree[a].add(b);
			tree[b].add(a);
		
		}
		dfs(1);
		for(int i=2;i<=N;i++) {
			sb.append(parent[i]).append('\n');
		}
		System.out.println(sb);
	}
	
	static void dfs(int root) {
		if(visit[root]) return;
		visit[root] = true;

		for(int x : tree[root]) {
			if(visit[x]) continue;
			parent[x] = root;
			dfs(x);
		}
	}
}