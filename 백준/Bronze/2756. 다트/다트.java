import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			int n = 0;
			int m = 0;

			for (int i = 0; i < 3; i++) {
				double x = Double.parseDouble(st.nextToken());
				double y = Double.parseDouble(st.nextToken());

				if (x * x + y * y <= 3 * 3) {
					n += 100;
				} else if (x * x + y * y <= 6 * 6) {
					n += 80;
				} else if (x * x + y * y <= 9 * 9) {
					n += 60;
				} else if (x * x + y * y <= 12 * 12) {
					n += 40;
				} else if (x * x + y * y <= 15 * 15) {
					n += 20;
				}
			}

			for (int i = 0; i < 3; i++) {
				double x = Double.parseDouble(st.nextToken());
				double y = Double.parseDouble(st.nextToken());

				if (x * x + y * y <= 3 * 3) {
					m += 100;
				} else if (x * x + y * y <= 6 * 6) {
					m += 80;
				} else if (x * x + y * y <= 9 * 9) {
					m += 60;
				} else if (x * x + y * y <= 12 * 12) {
					m += 40;
				} else if (x * x + y * y <= 15 * 15) {
					m += 20;
				}
			}

			if (n > m) {
				System.out.println("SCORE: " + n + " to " + m + ", PLAYER 1 WINS.");
			} else if (n < m) {
				System.out.println("SCORE: " + n + " to " + m + ", PLAYER 2 WINS.");
			} else {
				System.out.println("SCORE: " + n + " to " + m + ", TIE.");
			}

		}

	}
}