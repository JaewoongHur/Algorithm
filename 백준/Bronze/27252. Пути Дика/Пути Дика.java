import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int m = s.length();

		int n = 0;
		int max = 0;

		for (int i = 0; i < m; i++) {

			if (s.charAt(i) == '(') {
				n++;
			} else {
				n--;
			}

			max = Math.max(max, n);
		}
		n = max;

		char[][] map = new char[n][m];

		int h = 0;
		map[n - 1][0] = '/';

		for (int i = 1; i < m; i++) {

			if (s.charAt(i) == '(') {
				if (s.charAt(i - 1) == '(') {
					h++;
				}
				map[n - 1 - h][i] = '/';
			} else {
				if (s.charAt(i - 1) == ')') {
					h--;
				}
				map[n - 1 - h][i] = '\\';
			}

		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == '/' || map[i][j] == '\\') {
					sb.append(map[i][j]);
					continue;
				}
				sb.append('.');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}