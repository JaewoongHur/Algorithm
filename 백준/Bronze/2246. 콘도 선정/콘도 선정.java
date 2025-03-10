import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		boolean[] candidate = new boolean[n];
		int[] d = new int[n];
		int[] c = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int d0 = Integer.parseInt(st.nextToken());
			int c0 = Integer.parseInt(st.nextToken());

			d[i] = d0;
			c[i] = c0;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;

				if ((d[i] > d[j] && c[i] >= c[j]) || c[i] > c[j] && d[i] >= d[j]) {
					candidate[i] = true;
					break;
				}
			}
		}

		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (!candidate[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}