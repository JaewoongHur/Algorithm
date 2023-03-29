import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];
		int[] dp2 = new int[n + 1];
		int[] dp3 = new int[n + 1];
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		dp[1] = arr[0];
		dp2[1] = arr[0];
		dp3[1] = arr[0];
		if (n >= 2) {
			dp[2] = arr[0] + arr[1];
			dp2[2] = arr[1];
			dp3[2] = arr[1];
		}
		if (n >= 3) {
			dp[3] = arr[1] + arr[2];
			dp2[3] = arr[0] + arr[2];
			dp3[3] = arr[2];
		}
		if (n >= 4) {
			for (int i = 4; i <= n; i++) {
				dp[i] = Math.max(dp2[i - 1],dp3[i-1]) + arr[i - 1];
				dp2[i] = Math.max(Math.max(dp[i - 2], dp2[i - 2]),dp3[i-2]) + arr[i - 1];
				dp3[i] = Math.max(Math.max(dp[i - 3], dp2[i - 3]),dp3[i-3]) + arr[i-1];
			}
		}
		Arrays.sort(dp);
		Arrays.sort(dp2);
		Arrays.sort(dp3);
		System.out.println(Math.max(Math.max(dp[n], dp2[n]),dp3[n]) );
	}
}