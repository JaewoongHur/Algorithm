import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int N, M, min;
	static int[][] A;
	static boolean[][] visit;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		N = Integer.parseInt(s.split(" ")[0]);
		M = Integer.parseInt(s.split(" ")[1]);
		A = new int[N + 1][M + 1];
		visit = new boolean[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			s = br.readLine();
			for (int j = 1; j <= M; j++) {
				A[i][j] = s.charAt(j - 1) - '0';
			}
		}
		A[N][M] = 2;
		min = Integer.MAX_VALUE;
		bfs();
		System.out.println(min);
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 1 && r <= N && c >= 1 && c <= M;
	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { 1, 1, 1 });
		visit[1][1] = true;
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (!boundaryCheck(nr, nc) || visit[nr][nc] || A[nr][nc] == 0) {
					continue;
				} else {
					if (A[nr][nc] == 2) {
						min = Math.min(min, p[2] + 1);
					} else {
						q.offer(new int[] { nr, nc, p[2] + 1 });
						visit[nr][nc] = true;
					}
				}
			}
		}
	}
}