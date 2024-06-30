import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		if (n == 2) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int d = gcd(a, b);
			int t = 1;
			while (t <= d) {
				if (d % t == 0) {
					System.out.println(t);
				}
				t++;
			}
		} else if (n == 3) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int d = gcd(gcd(a, b), gcd(b, c));

			int t = 1;

			while (t <= d) {
				if (d % t == 0) {
					System.out.println(t);
				}
				t++;
			}
		}
	}

	static int gcd(int a, int b) {

		while (b > 0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return a;
	}
}