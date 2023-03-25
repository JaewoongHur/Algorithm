import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}

		int[] dp = new int[N + 1];
		int[] dp2 = new int[N + 1];

		dp[1] = A[1];
		dp2[1] = 0;
		if (N >= 2) {
			dp[2] = A[1] + A[2];
			dp2[2] = A[2];
		}
		if (N >= 3) {
			dp[3] = dp2[2] + A[3];
			dp2[3] = dp[1] + A[3];
		}
		for (int i = 4; i <= N; i++) {
			dp[i] = dp2[i - 1] + A[i];
			dp2[i] = Math.max(dp[i - 2] + A[i], dp2[i - 2] + A[i]);
		}
		System.out.println(Math.max(dp[N], dp2[N]));
	}
}