import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static char[] s1;
	static char[] s2;

	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		s1 = br.readLine().toCharArray();
		s2 = br.readLine().toCharArray();
		int n = s1.length;
		int m = s2.length;

		dp = new int[n][m];

		int a = 0;
		for (int i = 0; i < n; i++) {
			if (s2[0] == s1[i]) {
				a = 1;
			}
			dp[i][0] = Math.max(dp[i][0], a);
		}
		a = 0;
		for (int i = 0; i < m; i++) {
			if (s1[0] == s2[i]) {
				a = 1;
			}
			dp[0][i] = Math.max(dp[0][i], a);
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (s1[i] == s2[j]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		if (n == 0 || m == 0) {
			System.out.println(0);
		} else {
			System.out.println(dp[n - 1][m - 1]);
		}
	}

}