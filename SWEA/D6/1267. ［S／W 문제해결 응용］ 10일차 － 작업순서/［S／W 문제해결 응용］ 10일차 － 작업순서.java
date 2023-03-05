import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static StringBuilder sb = new StringBuilder();
	static int V, E;
	static List<List<Integer>> list;
	static boolean[] visit;
	static int[] degree;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int tc = 1; tc <= 10; tc++) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			degree = new int[V + 1];
			visit = new boolean[V + 1];

			list = new ArrayList<>();
			for (int i = 0; i <= V; i++) {
				list.add(new ArrayList<>());
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < E; i++) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				list.get(a).add(b);
				degree[b]++;
			}
			
			sb.append("#"+tc+" ");
			bfs();
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static void bfs() {
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= V; i++) {
			if (degree[i] == 0) {
				visit[i] = true;
				q.offer(i);
			}
		}
		
			while (!q.isEmpty()) {
				int p = q.poll();
				sb.append(p + " ");
				for (int k = 0; k < list.get(p).size(); k++) {
					int m = list.get(p).get(k);
					if (--degree[m]==0 && !visit[m]) {
						q.offer(m);
						visit[m] = true;
					}
				}
			}
		}
	
}