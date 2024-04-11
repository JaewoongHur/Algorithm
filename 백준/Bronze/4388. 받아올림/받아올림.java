import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			String a = st.nextToken();
			String b = st.nextToken();

			int cnt = 0;

			if (a.length() > b.length()) {
				String tmp = "";
				for (int i = 0; i < a.length() - b.length(); i++) {
					tmp += "0";
				}
				tmp += b;
				b = tmp;
			} else if (b.length() > a.length()) {
				String tmp = "";
				for (int i = 0; i < b.length() - a.length(); i++) {
					tmp += "0";
				}
				tmp += a;
				a = tmp;
			}

			int carry = 0;
			for (int i = 0; i < a.length(); i++) {
				int k = a.charAt(a.length() - i - 1) - '0' + b.charAt(b.length() - i - 1) - '0' + carry;
				if (k >= 10) {
					carry = 1;
					cnt++;
				} else {
					carry = 0;
				}
			}

			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
	}
}