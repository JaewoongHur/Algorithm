import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] map;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static boolean[][] visit, air;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visit = new boolean[N][M];
		air = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int time = 0;

		while (true) {
			if (check()) {
				break;
			}
			time++;
			path();
			deleteCheeze();
			resetAir();
		}
		System.out.println(time);

	}

	static boolean check() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	static void deleteCheeze() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1) {
					int cnt = 0;
					for (int d = 0; d < 4; d++) {
						int nr = i + dr[d];
						int nc = j + dc[d];
						if (!bound(nr, nc)) {
							continue;
						}
						if (air[nr][nc] && map[nr][nc] == 0) {
							cnt++;
						}
						if (cnt >= 2) {
							visit[i][j] = true;
						}
					}
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (visit[i][j]) {
					map[i][j] = 0;
					visit[i][j] = false;
				}
			}
		}
	}

	static void path() {
		out: for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1) {
					continue;
				}
				if (outer(i, j)) {
					reset();
					visitAir(i, j);
					break out;
				} else {
					reset();
				}
			}
		}

	}

	static void visitAir(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { r, c });
		air[r][c] = true;
		while (!q.isEmpty()) {
			int[] p = q.poll();

			int x = p[0];
			int y = p[1];

			for (int d = 0; d < 4; d++) {
				int nr = x + dr[d];
				int nc = y + dc[d];
				if (!bound(nr, nc) || map[nr][nc] == 1 || air[nr][nc]) {
					continue;
				}
				q.add(new int[] { nr, nc });
				air[nr][nc] = true;
			}

		}
	}

	static boolean outer(int r, int c) {

		visit[r][c] = true;

		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (!bound(nr, nc)) {
				return true;
			}
			if (visit[nr][nc] || map[nr][nc] == 1) {
				continue;
			}
			outer(nr, nc);
		}
		return false;
	}

	static void reset() {
		for (int i = 0; i < N; i++) {
			Arrays.fill(visit[i], false);
		}
	}

	static void resetAir() {
		for (int i = 0; i < N; i++) {
			Arrays.fill(air[i], false);
		}
	}

	static boolean bound(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}
}