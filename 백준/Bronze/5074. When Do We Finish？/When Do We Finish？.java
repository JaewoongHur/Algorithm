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
			if (s.equals("00:00 00:00")) {
				break;
			}

			st = new StringTokenizer(s);

			String a = st.nextToken();

			String b = st.nextToken();

			st = new StringTokenizer(a, ":");
			int ha = Integer.parseInt(st.nextToken());
			int ma = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(b, ":");
			int hb = Integer.parseInt(st.nextToken());
			int mb = Integer.parseInt(st.nextToken());

			int h = ha + hb;
			int m = ma + mb;

			if (m >= 60) {
				m -= 60;
				h += 1;
			}

			int n = h / 24;

			h %= 24;

			if (h < 10) {
				if (m < 10) {
					sb.append('0').append(h).append(':').append('0').append(m);
				} else {
					sb.append('0').append(h).append(':').append(m);
				}
			} else {
				if (m < 10) {
					sb.append(h).append(':').append('0').append(m);
				} else {
					sb.append(h).append(':').append(m);
				}
			}

			if (n >= 1) {
				sb.append(' ').append('+').append(n);
			}

			sb.append('\n');
		}
		System.out.println(sb);
	}
}