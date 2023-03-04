import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int N, min, coreMax;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static boolean[][] visit;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			int[][] A = new int[N][N];
			visit = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
					if ((i == 0 || j == 0 || i == N - 1 || j == N - 1) && A[i][j] == 1) {
						visit[i][j] = true;
					}
				}
			}
			coreMax = 0;
			min = Integer.MAX_VALUE;
			dfs(A,0,0,0,0);
			sb.append('#').append(tc).append(' ').append(min).append("\n");
		}
		System.out.println(sb);
	}

	static void dfs(int[][] A, int r, int c, int core, int wire) {
		if (r == N) {
			if (core > coreMax) {
				coreMax = core;
				min = wire;
			} else if (core == coreMax) {
				min = Math.min(min, wire);
			}
			return;
		}
		
		if (A[r][c] == 0 || A[r][c] == -1 || visit[r][c] == true) {
			if (c == N - 1) {
				dfs(A, r + 1, 0, core, wire);
			} else {
				dfs(A, r, c + 1, core, wire);
			}
		}

		else {
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				boolean possible = true;
				while (boundaryCheck(nr, nc)) {
					if (A[nr][nc] == -1 || A[nr][nc] == 1) {
						possible = false;
						break;
					}
					nr += dr[d];
					nc += dc[d];
				}
				if (!possible) {
					continue;
				} else {
					int[][] B = new int[N][N];
					copy(A, B);
					visit[r][c] = true;
					nr = r + dr[d];
					nc = c + dc[d];
					int cnt = 0;
					while (boundaryCheck(nr, nc)) {
						B[nr][nc] = -1;
						cnt++;
						nr += dr[d];
						nc += dc[d];
					}
					dfs(B, r, c, core + 1, wire + cnt);
					visit[r][c] = false;
				}

			}
			if (c == N - 1) {
				dfs(A, r + 1, 0, core, wire);
			} else {
				dfs(A, r, c + 1, core, wire);
			}

		}
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}

	static void copy(int[][] A, int[][] B) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				B[i][j] = A[i][j];
			}
		}
	}
}