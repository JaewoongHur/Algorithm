import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			System.out.println(a * b / gcd(a, b) + " " + gcd(a, b));
		}
	}

	static int gcd(int a, int b) {
		int r = a % b;

		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}

		return b;
	}
}