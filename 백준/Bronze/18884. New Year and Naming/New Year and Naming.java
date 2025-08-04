import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String[] A = new String[n];
		String[] B = new String[m];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			A[i % n] = st.nextToken();
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= m; i++) {
			B[i % m] = st.nextToken();
		}

		int k = n * m / gcd(n, m);

		String[] C = new String[k];

		for (int i = 1; i <= k; i++) {
			C[i % k] = A[i % n] + B[i % m];
		}

		int q = Integer.parseInt(br.readLine());

		for (int i = 0; i < q; i++) {
			int a = Integer.parseInt(br.readLine());

			System.out.println(C[a % k]);
		}
	}

	static int gcd(int a, int b) {

		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return a;
	}
}