import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine().trim());

		for (int tc = 0; tc < n; tc++) {
			int m = Integer.parseInt(br.readLine().trim());

			char[][] arr = new char[m][m];

			int sx = 0;
			int sy = 0;

			int px = 0;
			int py = 0;

			for (int i = 0; i < m; i++) {
				String s = br.readLine();
				for (int j = 0; j < m; j++) {
					arr[i][j] = s.charAt(j);

					if (arr[i][j] == 's') {
						sx = i;
						sy = j;
					}
				}
			}

			double d = Integer.MAX_VALUE;

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					if (arr[i][j] == 'p') {
						double k = Math.sqrt((sx - i) * (sx - i) + (sy - j) * (sy - j));

						if (k < d) {
							d = k;
							px = i;
							py = j;
						}
					}
				}
			}
			sb.append('(').append(sx).append(',').append(sy).append(')').append(':').append('(').append(px).append(',')
					.append(py).append(')').append(':').append(String.format("%.2f", d)).append('\n');

		}
		System.out.println(sb);
	}
}