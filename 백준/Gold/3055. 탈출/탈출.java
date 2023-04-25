import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	static int R, C, min;
	static char[][] map;
	static boolean[][] visit;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		R = Integer.parseInt(str[0]);
		C = Integer.parseInt(str[1]);

		map = new char[R][C];

		int sR = 0;
		int sC = 0;

		for (int r = 0; r < R; r++) {
			String s = br.readLine();
			for (int c = 0; c < C; c++) {
				map[r][c] = s.charAt(c);
				if (s.charAt(c) == 'S') {
					sR = r;
					sC = c;
					map[sR][sC] = '.';
				}
			}
		}

		visit = new boolean[R][C];
		min = Integer.MAX_VALUE;
		bfs(sR, sC);

		if (min == Integer.MAX_VALUE) {
			System.out.println("KAKTUS");
		} else {
			System.out.println(min);
		}
	}

	private static boolean boundary(int r, int c) {
		return r >= 0 && r < R && c >= 0 && c < C;
	}

	private static void bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { r, c, 0 });
		visit[r][c] = true;
		int idx = 0;

		while (!q.isEmpty()) {
			int[] p = q.poll();
			int x = p[0];
			int y = p[1];
			int t = p[2];
			

			if (map[x][y] == 'D') {
				min = Math.min(min, t);
				return;
			}
			
			if (idx == t) {
				flood();
				idx++;
			}
			
			for (int d = 0; d < 4; d++) {
				int nr = x + dr[d];
				int nc = y + dc[d];
				if (!boundary(nr, nc) || visit[nr][nc] || map[nr][nc] == '*' || map[nr][nc] == 'X') {
					continue;
				}
				q.add(new int[] { nr, nc, t + 1 });
				visit[nr][nc] = true;

			}

		}

	}

	private static void flood() {
		Queue<int[]> q = new LinkedList<>();
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				if (map[r][c] == '*') {
					q.add(new int[] { r, c });
				}
			}
		}

		while (!q.isEmpty()) {
			int[] p = q.poll();
			int x = p[0];
			int y = p[1];

			for (int d = 0; d < 4; d++) {
				int nx = x + dr[d];
				int ny = y + dc[d];

				if (!boundary(nx, ny) || map[nx][ny] == '*' || map[nx][ny] == 'D' || map[nx][ny] == 'X') {
					continue;
				}

				map[nx][ny] = '*';

			}
		}
	}
}