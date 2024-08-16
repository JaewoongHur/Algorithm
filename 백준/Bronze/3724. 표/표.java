import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			BigInteger[][] arr = new BigInteger[n][m];

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < m; j++) {
					arr[i][j] = new BigInteger(st.nextToken());
				}
			}

			BigInteger max = BigInteger.ONE;

			for (int i = 0; i < n; i++) {
				max = max.multiply(arr[i][0]);
			}

			int ans = 0;

			for (int i = 0; i < m; i++) {
				BigInteger a = BigInteger.ONE;

				for (int j = 0; j < n; j++) {
					a = a.multiply(arr[j][i]);
				}

				if (max.compareTo(a) <= 0) {
					max = a;
					ans = i + 1;
				}
			}

			System.out.println(ans);
		}
	}
}