import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int N, D;
	static int[] dp;
	static boolean[] visit;
	static List<List<Road>> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());

		dp = new int[D + 1];
		visit = new boolean[D + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;

		for (int i = 0; i <= D; i++) {
			list.add(new ArrayList<>());
			if(i==D) {
				continue;
			}
			list.get(i).add(new Road(i + 1, 1));

		}
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			if(e>D) {
				continue;
			}
			list.get(s).add(new Road(e, w));
		}
		PriorityQueue<Road> pq = new PriorityQueue<>();
		pq.add(new Road(0, 0));

		while (!pq.isEmpty()) {
			Road cur = pq.poll();
			if (visit[cur.e] == true) {
				continue;
			}
			visit[cur.e] = true;

			int size = list.get(cur.e).size();

			for (int i = 0; i < size; i++) {
				Road next = list.get(cur.e).get(i);
				if (dp[next.e] > dp[cur.e] + next.w) {
					dp[next.e] = dp[cur.e] + next.w;
					pq.add(new Road(next.e, dp[next.e]));
				}
			}
		}
		System.out.println(dp[D]);
	}

	private static class Road implements Comparable<Road> {
		int e; // end
		int w; // weight

		public Road(int e, int w) {
			this.e = e;
			this.w = w;
		}

		@Override
		public int compareTo(Road o) {
			return this.w - o.w;
		}

	}

}