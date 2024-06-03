import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("*")) {
				break;
			}

			st = new StringTokenizer(s, "/");

			int m = st.countTokens();

			int a = 0;

			for (int i = 0; i < m; i++) {
				String t = st.nextToken();
				int n = t.length();

				double b = 0;

				for (int j = 0; j < n; j++) {
					if (t.charAt(j) == 'W') {
						b += 1;
					} else if (t.charAt(j) == 'H') {
						b += 1 / 2d;
					} else if (t.charAt(j) == 'Q') {
						b += 1 / 4d;
					} else if (t.charAt(j) == 'E') {
						b += 1 / 8d;
					} else if (t.charAt(j) == 'S') {
						b += 1 / 16d;
					} else if (t.charAt(j) == 'T') {
						b += 1 / 32d;
					} else {
						b += 1 / 64d;
					}
				}

				if (b == 1) {
					a++;
				}
			}
			sb.append(a).append('\n');
		}

		System.out.println(sb);
	}
}