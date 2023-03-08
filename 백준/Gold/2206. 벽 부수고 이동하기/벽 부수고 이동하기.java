import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int N, M, min;
	static int[][] A;
	static boolean[][] visit, visit1;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		N = Integer.parseInt(s.split(" ")[0]);
		M = Integer.parseInt(s.split(" ")[1]);
		A = new int[N][M];
		visit = new boolean[N][M];
		visit1 = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			s = br.readLine();
			for (int j = 0; j < M; j++) {
				A[i][j] = s.charAt(j) - '0';
			}
		}
		min = -1;
		bfs();
		System.out.println(min);	
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] { 0, 0, 0, 1 });
		visit[0][0] = true;
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];
			if (r == N - 1 && c == M - 1) {
				min = p[3];
				return;
			}
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (!boundaryCheck(nr, nc)) {
					continue;
				}
				if (A[nr][nc] == 0) {
					if (p[2] == 0 && !visit[nr][nc]) {
						q.offer(new int[] { nr, nc, p[2], p[3] + 1 });
						visit[nr][nc] = true;
					} else if (p[2] == 1 && !visit1[nr][nc]) {
						q.offer(new int[] { nr, nc, p[2], p[3] + 1 });
						visit1[nr][nc] = true;
					}
				} else if (A[nr][nc] == 1) {
					if (p[2] == 0) {
						q.offer(new int[] { nr, nc, p[2] + 1, p[3] + 1 });
						visit1[nr][nc] = true;
					}
				}
			}
		}
	}
}