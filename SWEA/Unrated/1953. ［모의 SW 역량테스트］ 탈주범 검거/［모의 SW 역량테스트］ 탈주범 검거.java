import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int N, M, R, C, L;
	static int[][] A;
	static boolean[][] visit;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());

			A = new int[N][M];
			visit = new boolean[N][M];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			sb.append("#" + tc + " ");
			bfs();
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (visit[i][j]) {
						cnt++;
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { R, C, 1 });
		visit[R][C] = true;

		while (!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];
			int t = p[2];
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (A[r][c] == 2) {
					if (d == 1 || d == 3) {
						continue;
					}
				} else if (A[r][c] == 3) {
					if (d == 0 || d == 2) {
						continue;
					}
				} else if (A[r][c] == 4) {
					if (d == 2 || d == 3) {
						continue;
					}
				} else if (A[r][c] == 5) {
					if (d == 0 || d == 3) {
						continue;
					}
				} else if (A[r][c] == 6) {
					if (d == 0 || d == 1) {
						continue;
					}
				} else if (A[r][c] == 7) {
					if (d == 1 || d == 2) {
						continue;
					}
				}

				if (!boundaryCheck(nr, nc) || visit[nr][nc] || A[nr][nc] == 0 || t >= L) {
					continue;
				}
				if (d == 0 && (A[nr][nc] == 3 || A[nr][nc] == 4 || A[nr][nc] == 7)) {
					continue;
				}
				else if (d == 1 && (A[nr][nc] == 2 || A[nr][nc] == 4 || A[nr][nc] == 5)) {
					continue;
				} else if (d == 2 && (A[nr][nc] == 3 || A[nr][nc] == 5 || A[nr][nc] == 6)) {
					continue;
				} else if (d == 3 && (A[nr][nc] == 2 || A[nr][nc] == 6 || A[nr][nc] == 7)) {
					continue;
				}
				q.offer(new int[] { nr, nc, t + 1 });
				visit[nr][nc] = true;
			}
		}

	}

}