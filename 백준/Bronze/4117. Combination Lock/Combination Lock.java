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
			if (s.equals("0 0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			int t1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			int t3 = Integer.parseInt(st.nextToken());

			int ans = 4 * n - 1;

			if (t2 >= t1) {
				ans += t2 - t1;
			} else {
				ans += n - (t1 - t2);
			}

			if (t2 >= t3) {
				ans += t2 - t3;
			} else {
				ans += n - (t3 - t2);
			}
			sb.append(ans).append('\n');
		}
		System.out.println(sb);
	}
}