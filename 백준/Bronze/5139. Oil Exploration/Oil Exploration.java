import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= n; tc++) {
			String[] s = br.readLine().split(" ");

			int h = Integer.parseInt(s[0]);

			int w = Integer.parseInt(s[1]);

			char[][] arr = new char[h][w];

			for (int i = 0; i < h; i++) {
				String t = br.readLine();
				for (int j = 0; j < w; j++) {
					arr[i][j] = t.charAt(j);
				}
			}

			sb.append("Data Set ").append(tc).append(":").append('\n');

			for (int i = 0; i < w; i++) {
				boolean pass = false;
				int a = 0;
				for (int j = 0; j < h; j++) {
					if (arr[j][i] == 'X') {
						pass = true;
						break;
					} else if (arr[j][i] == 'H') {
						a += 3;
					} else {
						a++;
					}
				}

				if (pass) {
					sb.append(a).append(' ');
				} else {
					sb.append("N").append(' ');
				}
			}
			sb.append('\n').append('\n');
		}
		System.out.println(sb);
	}
}