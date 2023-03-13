import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static List<List<Integer>> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

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

		boolean[] visit = new boolean[N + 1];
		int connectedComponent = 0;
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			if (!visit[i]) {
				q.offer(i);
				visit[i] = true;
				connectedComponent++;
				while (!q.isEmpty()) {
					int p = q.poll();
					int n = list.get(p).size();
					for (int j = 0; j < n; j++) {
						int r = list.get(p).get(j);
						if (visit[r]) {
							continue;
						}
						q.offer(r);
						visit[r] = true;
					}
				}
			}
		}
		System.out.println(connectedComponent);
	}
}