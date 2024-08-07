import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");

		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);

		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };

		int a = 1;
		int d = 0;
		int ans = 0;

		boolean[][] visit = new boolean[n][m];
		visit[0][0] = true;

		int r = 0;
		int c = 0;

		while (true) {
			if (a == n * m) {
				System.out.println(ans);
				break;
			}

			int nr = r + dr[d];
			int nc = c + dc[d];

			if (nr < 0 || nr >= n || nc < 0 || nc >= m || visit[nr][nc]) {
				d ++;
				if(d == 4) {
					d = 0;
				}
				ans++;
				
				nr = r + dr[d];
				nc = c + dc[d];
			}
			
			visit[nr][nc] = true;
			r = nr; c = nc;
			
			a++;
		}
	}
}