import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, start;
	static boolean[] visit;
	static List<List<Integer>> list = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}
		for (int i = 1; i <= N; i++) {
			Collections.sort(list.get(i));
		}
		visit = new boolean[N + 1];
		dfs(start);
		sb.append("\n");
		visit = new boolean[N+1];
		bfs(start);
		System.out.println(sb);
	}

	static void dfs(int k) {
		if (!visit[k]) {
			visit[k] = true;
			sb.append(k+" ");
		} else {
			return;
		}

		int n = list.get(k).size();
		for (int i = 0; i < n; i++) {
			int p = list.get(k).get(i);
			if (!visit[p]) {
				dfs(p);
			}
		}
	}

	static void bfs(int k) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(k);
		sb.append(k+" ");
		visit[k] = true;
		while(!q.isEmpty()) {
			int p = q.poll();
			int n = list.get(p).size();
			for(int i=0;i<n;i++) {
				int r = list.get(p).get(i);
				if(!visit[r]) {
					q.offer(r);
					visit[r] = true;
					sb.append(r+" ");
				}
			}
		}	
	}
}