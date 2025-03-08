import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();
			if (s.equals("0")) {
				break;
			}

			st = new StringTokenizer(s);

			int b = Integer.parseInt(st.nextToken());
			String t = st.nextToken();
			String a = st.nextToken();

			int p = t.charAt(0) - '0';
			int m = 0;

			for (int i = 0; i < a.length(); i++) {
				m += ((int) Math.pow(b, a.length() - 1 - i)) * (a.charAt(i) - '0');
			}

			for (int i = 0; i < t.length() - 1; i++) {
				p = (p * b + t.charAt(i + 1) - '0') % m;
			}

			StringBuilder sb = new StringBuilder();

			int k = p;

			while (true) {
				sb.append(k % b);
				k = k / b;

				if (k == 0) {
					break;
				}
			}

			System.out.println(sb.reverse().toString());
		}
	}
}