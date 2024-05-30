import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			String[] s = br.readLine().split(" ");

			int m = s[0].length();

			sb.append("Distances: ");

			for (int i = 0; i < m; i++) {
				int a = s[1].charAt(i) - s[0].charAt(i);

				if (a >= 0) {
					sb.append(a).append(' ');
				} else {
					sb.append(a + 26).append(' ');
				}
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}