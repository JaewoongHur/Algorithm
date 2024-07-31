import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] map = new char[4][4];

		char a = 'A';

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				map[i][j] = a;

				a = (char) (a + 1);
			}
		}

		map[3][3] = '.';

		char[][] puzzle = new char[4][4];

		for (int i = 0; i < 4; i++) {
			String s = br.readLine();
			for (int j = 0; j < 4; j++) {
				puzzle[i][j] = s.charAt(j);
			}
		}

		int ans = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (map[i][j] == '.')
					continue;

				for (int r = 0; r < 4; r++) {
					for (int c = 0; c < 4; c++) {
						if (puzzle[r][c] == map[i][j]) {
							ans += Math.abs(r - i) + Math.abs(c - j);
						}
					}
				}

			}
		}
		System.out.println(ans);
	}
}