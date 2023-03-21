import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];
		for (int i = 1; i * i <= n; i++) {
			dp[i * i] = 1;
		}
		for (int i = 1; i <= n; i++) {
			if (dp[i] == 1) {
				continue;
			}
			int x = (int) Math.sqrt(i);
			int min = Integer.MAX_VALUE;
			for (int j = 1; j <= x; j++) {
				min = Math.min(min, 1 + dp[i - j * j]);
			}
			dp[i] = min;
		}
		System.out.println(dp[n]);
	}
}