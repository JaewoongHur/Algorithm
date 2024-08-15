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

		int tc = 1;

		while (true) {
			s = br.readLine();

			if (s.equals("0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			sb.append("Triangle #").append(tc).append('\n');

			if (a == -1) {
				int k = c * c - b * b;

				if (k <= 0) {
					sb.append("Impossible.").append('\n');
				} else {
					double d = Math.sqrt(k);
					sb.append("a = ").append(String.format("%.3f", d)).append('\n');
				}
			} else if (b == -1) {
				int k = c * c - a * a;

				if (k <= 0) {
					sb.append("Impossible.").append('\n');
				} else {
					double d = Math.sqrt(k);
					sb.append("b = ").append(String.format("%.3f", d)).append('\n');
				}

			} else if (c == -1) {
				int k = a * a + b * b;
				double d = Math.sqrt(k);
				sb.append("c = ").append(String.format("%.3f", d)).append('\n');
			}
			
			sb.append('\n');
			
			tc++;
		}
		System.out.println(sb);
	}
}