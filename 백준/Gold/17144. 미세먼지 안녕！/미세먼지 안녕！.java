import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int R, C, c1, c2;
	static int[][] map;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		map = new int[R + 1][C + 1];
		c1 = 0;

		for (int i = 1; i <= R; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= C; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == -1) {
					if (c1 == 0) {
						c1 = i;
						c2 = i + 1;
					}
				}
			}
		}

		for (int k = 0; k < T; k++) {
			int[][] exp = new int[R + 1][C + 1];
			for (int i = 1; i <= R; i++) {
				for (int j = 1; j <= C; j++) {
					if (j == 1 && (i == c1 || i == c2)) {
						continue;
					}
					expand(i, j, exp);
				}
			}
			calc(exp);
			circulate1(c1, 1, 0);
			circulate2(c2, 1, 2);
		}
		System.out.println(remain());

	}

	static void expand(int r, int c, int[][] exp) {
		int A = map[r][c] / 5;
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (!bound(nr, nc) || map[nr][nc] == -1) {
				continue;
			}
			exp[nr][nc] += A;
			map[r][c] -= A;
		}
	}

	static void calc(int[][] exp) {
		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				map[i][j] += exp[i][j];
			}
		}
	}

	static void circulate1(int r, int c, int d) {
		if (r == 1 && c == 1) {
			d = 1;
		}
		if (r == 1 && c == C) {
			d = 2;
		}
		if (r == c1 && c == C) {
			d = 3;
		}

		int nr = r + dr[d];
		int nc = c + dc[d];
		if (map[nr][nc] == -1) {
			return;
		}
		if (bound(nr, nc)) {
			int tmp = map[nr][nc];
			if (map[r][c] != -1) {
				map[nr][nc] = 0;
				map[r][c] = tmp;
			}
		}
		circulate1(nr, nc, d);
	}

	static void circulate2(int r, int c, int d) {
		if (r == c2 && c == C) {
			d = 3;
		}
		if (r == R && c == 1) {
			d = 1;
		}
		if (r == R && c == C) {
			d = 0;
		}

		int nr = r + dr[d];
		int nc = c + dc[d];
		if (map[nr][nc] == -1) {
			return;
		}
		if (bound(nr, nc)) {
			int tmp = map[nr][nc];
			if (map[r][c] != -1) {
				map[nr][nc] = 0;
				map[r][c] = tmp;
			}
		}
		circulate2(nr, nc, d);
	}

	static int remain() {
		int res = 0;
		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				if (map[i][j] <= 0) {
					continue;
				}
				res += map[i][j];
			}
		}
		return res;
	}

	static boolean bound(int r, int c) {
		return r >= 1 && r <= R && c >= 1 && c <= C;
	}

}