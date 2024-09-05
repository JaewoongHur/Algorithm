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

		int t = 1;

		while (true) {
			s = br.readLine();

			if (s.equals("0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			sb.append("Hole ").append('#').append(t).append('\n');

			if (b == 1) {
				sb.append("Hole-in-one.").append('\n').append('\n');
				t++;
				continue;
			}

			if (a - b >= 3) {
				sb.append("Double eagle.");
			} else if (a - b == 2) {
				sb.append("Eagle.");
			} else if (a - b == 1) {
				sb.append("Birdie.");
			} else if (a - b == 0) {
				sb.append("Par.");
			} else if (a - b == -1) {
				sb.append("Bogey.");
			} else if (a - b <= -2) {
				sb.append("Double Bogey.");
			}
			
			sb.append("\n\n");
			t++;
		}
		System.out.println(sb);
	}
}