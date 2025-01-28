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
			br.readLine();
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			double a = 0;
			double b = 0;

			int[] C = new int[n];

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++) {
				C[i] = Integer.parseInt(st.nextToken());
				a += C[i];
			}

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < m; i++) {
				b += Integer.parseInt(st.nextToken());
			}

			double avgA = a / n;
			double avgB = b / m;

			int ans = 0;

			for (int i = 0; i < n; i++) {
				double na = (a - C[i]) / (n - 1);
				double nb = (b + C[i]) / (m + 1);

				if (na > avgA && nb > avgB) {
					ans++;
				}
			}
			
			System.out.println(ans);
		}
	}
}