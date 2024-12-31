import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		char[][] map = new char[n][n];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();

			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j);
			}
		}

		int[] dr = new int[] { -1, -1, -1, 0, 1, 1, 1, 0 };
		int[] dc = new int[] { -1, 0, 1, 1, 1, 0, -1, -1 };

		char[][] ans = new char[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] != '.') {
					ans[i][j] = '*';
					continue;
				}

				int k = 0;

				for (int d = 0; d < 8; d++) {
					int nr = i + dr[d];
					int nc = j + dc[d];

					if (!bound(nr, nc, n)) {
						continue;
					}

					if (map[nr][nc] != '.') {
						k += map[nr][nc] - '0';
					}
				}
				if (k >= 10) {
					ans[i][j] = 'M';
				} else {
					ans[i][j] = (char) (k + '0');
				}
			}
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}

	}

	private static boolean bound(int r, int c, int n) {
		return r >= 0 && r < n && c >= 0 && c < n;
	}

}