import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int ans, cnt, N, r, c;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		N = Integer.parseInt(s[0]);
		r = Integer.parseInt(s[1]);
		c = Integer.parseInt(s[2]);

		ans = 0;
		Z(N, 0, 0, 0);
		System.out.println(ans);
	}

	private static void Z(int n, int x, int y, int idx) {
		if (n == 0) {
			if (x == r && y == c) {
				ans = idx;
			}
			return;

		}

		int k = (int) Math.pow(2, n - 1);

		if (r < x + k && c < y + k) {
			Z(n - 1, x, y, idx);
		} else if (r < x + k && c >= y + k) {
			Z(n - 1, x, y + k, idx + k * k);
		} else if (r >= x + k && c < y + k) {
			Z(n - 1, x + k, y, idx + 2 * k * k);
		} else if (r >= x + k && c >= y + k) {
			Z(n - 1, x + k, y + k, idx + 3 * k * k);
		}
	}

}