import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	static int[][] arr;
	static boolean[][] visit;
	static int[] dr = {-1,0,1,0};
	static int[] dc = {0,1,0,-1};
	static int possible;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());
			arr = new int[16][16];
			visit = new boolean[16][16];
			int r1 = 0;
			int c1 = 0;
			int r2 = 0;
			int c2 = 0;
			possible = 0;

			for (int i = 0; i < 16; i++) {
				String s = br.readLine();
				for (int j = 0; j < 16; j++) {
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

			dfs(r1, c1);
			sb.append('#').append(tc).append(' ').append(possible).append("\n");
		}
		System.out.println(sb);
	}

	public static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < 16 && c >= 0 && c < 16;
	}

	public static void dfs(int r, int c) {

		visit[r][c] = true;

		if (arr[r][c] == 3) {
			possible = 1;
			return;
		}

		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (boundaryCheck(nr, nc)) {
				if (!visit[nr][nc] && (arr[nr][nc] == 0 | arr[nr][nc] == 3)) {
					dfs(nr, nc);
				}
			}
		}

	}

}