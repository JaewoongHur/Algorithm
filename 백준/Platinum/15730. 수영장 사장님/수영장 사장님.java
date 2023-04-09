import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, 1, -1 };

	static class water implements Comparable<water> {
		int r;
		int c;
		int h;

		public water(int r, int c, int h) {
			this.r = r;
			this.c = c;
			this.h = h;
		}

		@Override
		public int compareTo(water o) {

			return this.h - o.h;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][M];
		boolean[][] visit = new boolean[N][M];
		int ans = 0;
		PriorityQueue<water> pq = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (!edgeCheck(i, j)) {
					pq.add(new water(i, j, arr[i][j]));
					visit[i][j] = true;
				}
			}
		}

		while (!pq.isEmpty()) {
			water cur = pq.poll();
			for (int d = 0; d < 4; d++) {
				int nr = cur.r + dr[d];
				int nc = cur.c + dc[d];
				if(!boundaryCheck(nr,nc)|| visit[nr][nc]) {
					continue;
				}
				
				if(cur.h>arr[nr][nc]) {
					ans += cur.h - arr[nr][nc];
				}
				pq.add(new water(nr,nc,Math.max(cur.h, arr[nr][nc])));
				visit[nr][nc] = true;	

			}

		}
		System.out.println(ans);
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}

	static boolean edgeCheck(int r, int c) {
		return r >= 1 && r < N - 1 && c >= 1 && c < M - 1;
	}

}