import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(br.readLine().trim());
		String s = br.readLine();

		int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1, 0 };
		int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1, 0 };

		int cnt = 0;

		int a = 0;
		int b = 0;

		for (int d = 0; d < 9; d++) {
			int nr = x + dr[d];
			int nc = y + dc[d];

			if (nr == a && nc == b) {
				cnt++;
				System.out.println(0);
				break;
			}
		}

		for (int i = 1; i <= n; i++) {
			if (s.charAt(i - 1) == 'S') {
				a += dr[2];
				b += dc[2];
			} else if (s.charAt(i - 1) == 'I') {
				a += dr[4];
				b += dc[4];
			} else if (s.charAt(i - 1) == 'J') {
				a += dr[6];
				b += dc[6];
			} else if (s.charAt(i - 1) == 'Z') {
				a += dr[0];
				b += dc[0];
			}
			
			for (int d = 0; d < 9; d++) {
				int nr = x + dr[d];
				int nc = y + dc[d];

				if (nr == a && nc == b) {
					cnt++;
					System.out.println(i);
					break;
				}
			}

		}
		if (cnt == 0) {
			System.out.println(-1);
		}
	}
}