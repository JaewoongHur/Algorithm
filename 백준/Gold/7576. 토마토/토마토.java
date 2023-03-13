import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int N, M, day;
	static int[][] A;
	static boolean[][] visit;
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		visit = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				if (A[i][j] == 1) {
					q.offer(new int[] { i, j, 0 });
					visit[i][j] = true;
				}
			}
		}
		bfs();
		boolean check = true;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (A[i][j] == 0) {
					check = false;
					break;
				}
			}
		}
		if (check) {
			System.out.println(day);
		} else {
			System.out.println(-1);
		}
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}

	static void bfs() {
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];
			day = p[2];
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (!boundaryCheck(nr, nc) || visit[nr][nc] || A[nr][nc] == -1) {
					continue;
				}
				if (A[nr][nc] == 0) {
					A[nr][nc] = 1;
					q.offer(new int[] { nr, nc, p[2] + 1 });
				}
			}
		}
	}
}