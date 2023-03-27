import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N + 1][10];
		for (int i = 1; i <= 9; i++) {
			dp[1][i]++;
		}
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j - 1 >= 0 && j + 1 < 10) {
					dp[i][j] = modular(dp[i][j],modular(dp[i-1][j-1],dp[i-1][j+1]));
				} else if (j - 1 < 0) {
					dp[i][j] = modular(dp[i][j],dp[i-1][j+1]);
				} else {
					dp[i][j] = modular(dp[i][j],dp[i-1][j-1]);
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = modular(sum,dp[N][i]);
		}
		System.out.println(sum % 1000000000);
	}

	static int modular(int a, int b) {
		return (a % 1000000000 + b % 1000000000)% 1000000000;
	}
}