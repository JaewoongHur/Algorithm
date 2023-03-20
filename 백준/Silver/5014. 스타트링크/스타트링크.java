import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());

		List<List<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>());
		for (int i = 1; i <= F; i++) {
			list.add(new ArrayList<>());
			if (i + U <= F) {
				list.get(i).add(i + U);
			}
			if (i - D > 0) {
				if (i - D == i + U) {
					continue;
				}
				list.get(i).add(i - D);
			}
		}

		boolean[] visit = new boolean[F + 1];

		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { S, 0 });
		visit[S] = true;
		
		int min = -1;

		 while (!q.isEmpty()) {
			int[] p = q.poll();
			int n = list.get(p[0]).size();
			if (p[0] == G) {
				min = p[1];
				break ;
			}

			for (int i = 0; i < n; i++) {
				int r = list.get(p[0]).get(i);
				if (!visit[r]) {
					q.offer(new int[] { r, p[1] + 1 });
					visit[r] = true;
				}
			}
		}
		if (min >= 0) {
			System.out.println(min);
		} else {
			System.out.println("use the stairs");
		}
	}
}