import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int K = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= K; tc++) {
			st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());

			ArrayList<Integer>[] list = new ArrayList[V + 1];

			boolean[] visit = new boolean[V + 1];
			int[] c = new int[V + 1];

			for (int i = 0; i <= V; i++) {
				list[i] = new ArrayList<>();
			}

			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				list[a].add(b);
				list[b].add(a);
			}
			boolean bipartiteGraph = true;
			out: for (int i = 1; i <= V; i++) {
				if(visit[i]) {
					continue;
				}
				Queue<Integer> q = new LinkedList<>();
				q.add(i);
				c[i] = 1;

				 while (!q.isEmpty()) {
					int n = q.poll();
					int color = c[n];
					if (visit[n]) {
						continue;
					}

					visit[n] = true;

					for (int next : list[n]) {

						if (c[next] == 0) {
							if (color == 1) {
								q.add(next);
								c[next] = 2;
							} else if (color == 2) {
								q.add(next);
								c[next] = 1;
							}
						} else if (color == c[next]) {
							bipartiteGraph = false;
							break out;
						}

					}

				}
			}
			if (bipartiteGraph) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}