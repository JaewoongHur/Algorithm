import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		ArrayList<Integer>[] list = new ArrayList[101];

		for (int i = 0; i <= 100; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < N + M; i++) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);

			list[a].add(b);
		}

		int min = Integer.MAX_VALUE;

		boolean[] visit = new boolean[101];

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { 1, 0 });
		visit[1] = true;

		while (!q.isEmpty()) {
			int[] p = q.poll();

			int k = p[0];
			int cnt = p[1];

			if (k == 100) {
				min = Math.min(min, cnt);
			}

			for (int d = 1; d <= 6; d++) {
				int end = k + d;

				if (end > 100 || visit[end]) {
					continue;
				}

				if (list[end].size() != 0) {
					q.add(new int[] { list[end].get(0), cnt + 1 });
				} else {
					q.add(new int[] { end, cnt + 1 });
				}
				if (end != 100) {
					visit[end] = true;
				}
			}
		}
		System.out.println(min);
	}

}