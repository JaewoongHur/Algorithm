import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int s = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());

			int a = 0;
			int b = 0;

			a += (n / (s * t)) * s * t;
			b += (n / (s * t)) * (t + r);

			if (n % (s * t) == 0) {
				b -= r;
			}

			int c = n - a;
			int d = 0;
			if (c % s == 0) {
				d = c / s;
			} else {
				d = c / s + 1;
			}
			System.out.println(b + d);
		}
	}
}