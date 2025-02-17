import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			if (m >= 45) {
				m -= 45;
			} else {
				if (h > 0) {
					--h;
				} else {
					h = 23;
				}

				m = (m + 15) % 60;
			}
			sb.append("Case #").append(i).append(": ").append(h).append(' ').append(m).append('\n');
		}
		System.out.println(sb);
	}
}