import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int h1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int s1 = Integer.parseInt(st.nextToken());
			int hs1 = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int h2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int s2 = Integer.parseInt(st.nextToken());
			int hs2 = Integer.parseInt(st.nextToken());

			double r = Double.parseDouble(br.readLine());

			double t = 360000 * (h2 - h1) + 6000 * (m2 - m1) + 100 * (s2 - s1) + hs2 - hs1;

			if (t < 0) {
				t += 360000 * 12;
			}

			t = t / (12 * 360000);

			double ans = t * Math.PI * r * r;

			System.out.printf(tc + ". %.3f", ans);

		}
	}
}