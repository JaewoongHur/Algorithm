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

			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int a = 0;
			int b = 0;

			for (int i = 0; i < n; i++) {
				int k = Integer.parseInt(st.nextToken());
				if (i == 0) {
					a = k;
				}

				if (i == n - 1) {
					b = k;
				}
			}

			if (x == a && y == b) {
				System.out.println("BOTH");
			} else if (x == a && y != b) {
				System.out.println("EASY");
			} else if (x != a && y == b) {
				System.out.println("HARD");
			} else {
				System.out.println("OKAY");
			}
		}
	}
}