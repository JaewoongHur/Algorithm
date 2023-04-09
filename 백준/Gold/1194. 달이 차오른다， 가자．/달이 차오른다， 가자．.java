import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.BufferedReader;

import java.io.IOException;

public class Main {
	static int N, M;
	static char[][] map;
	static boolean[][][] visit;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new char[N][M];
		visit = new boolean[64][N][M];

		int sr = 0;
		int sc = 0;

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j);
				if (map[i][j] == '0') {
					sr = i;
					sc = j;
				}
			}
		}
		bfs(sr, sc);
	}

	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { x, y, 0, 0 });

		while (!q.isEmpty()) {
			int[] p = q.poll();

			int r = p[0];
			int c = p[1];
			int cnt = p[2];
			int key = p[3];
			
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (!boundaryCheck(nr, nc) || map[nr][nc] == '#' || visit[key][nr][nc]) {
					continue;
				}

				if (map[nr][nc] == '1') {
					System.out.println(cnt + 1);
					return;
				} else if (map[nr][nc] == '0' || map[nr][nc] == '.') {
					visit[key][nr][nc] = true;
					q.add(new int[] { nr, nc, cnt + 1, key });
				} else if (map[nr][nc] >= 'a' && map[nr][nc] <= 'f') {
					visit[key][nr][nc] = true;
					int nkey = key | (1 << map[nr][nc] - 'a');
					q.add(new int[] { nr, nc, cnt + 1, nkey });
				} else if (map[nr][nc] >= 'A' && map[nr][nc] <= 'F') {
					if ((key & (1 << (map[nr][nc] - 'A'))) != 0) {
						visit[key][nr][nc] = true;
						q.add(new int[] { nr, nc, cnt + 1, key });
					}
				}

			}
		}
		System.out.println(-1);
	}

	private static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}

}