import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] A = new int[n][n];
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < i + 1; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp[0][0] = A[0][0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (j == 0) {
					dp[i][j] = A[i][j] + dp[i - 1][j];
				} else if (j == i) {
					dp[i][j] = A[i][j] + dp[i - 1][j - 1];
				} else {
					dp[i][j] = A[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
				}
			}
		}
		int max = dp[0][0];
		for (int i = 0; i < n - 1; i++) {
			max = Math.max(max, Math.max(dp[n - 1][i], dp[n - 1][i + 1]));
		}
		System.out.println(max);
	}
}