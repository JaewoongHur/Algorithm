import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	static int[][] arr;
	static boolean[][] visit;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int possible;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());
			arr = new int[100][100];
			visit = new boolean[100][100];
			int r1 = 0;
			int c1 = 0;
			int r2 = 0;
			int c2 = 0;
			possible = 0;

			for (int i = 0; i < 100; i++) {
				String s = br.readLine();
				for (int j = 0; j < 100; j++) {
					arr[i][j] = s.charAt(j) - '0';
					if (arr[i][j] == 2) {
						r1 = i;
						c1 = j;
					} else if (arr[i][j] == 3) {
						r2 = i;
						c2 = j;
					}
				}
			}

			bfs(r1, c1);
			sb.append('#').append(tc).append(' ').append(possible).append("\n");
		}
		System.out.println(sb);
	}

	public static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < 100 && c >= 0 && c < 100;
	}

	public static void bfs(int r, int c) {
		Queue<Pair> q = new LinkedList<>();
		q.offer(new Pair(r, c));

		visit[r][c] = true;

		while (!q.isEmpty()) {
			Pair p = q.poll();
			r = p.r;
			c = p.c;
			for (int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				if (boundaryCheck(nr, nc)) {
					if (!visit[nr][nc]) {
						if (arr[nr][nc] == 1) {
							continue;
						} else if (arr[nr][nc] == 3) {
							possible = 1;
							return;
						}
						else {
							q.add(new Pair(nr,nc));
							visit[nr][nc] = true;
						}
					}
				}
			}

		}
	}
}

class Pair {
	int r;
	int c;

	public Pair(int r, int c) {
		this.r = r;
		this.c = c;
	}

}