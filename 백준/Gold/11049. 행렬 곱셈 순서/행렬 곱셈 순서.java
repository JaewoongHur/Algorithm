import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		int[][] dp = new int[N][N];

		for (int i = 1; i <= N - 1; i++) {
			for (int j = 0; j <= N - i - 1; j++) {
				if (i == 1) {
					dp[j][i + j] = arr[j][0] * arr[j][1] * arr[i + j][1];
				} else {
					int min = Math.min(dp[j][i + j - 1] + arr[j][0] * arr[i + j][0] * arr[i + j][1],
							dp[j + 1][i + j] + arr[j][0] * arr[j][1] * arr[i + j][1]);

					for (int k = j + 1; k <= i + j - 2; k++) {
						min = Math.min(min, dp[j][k] + dp[k + 1][i + j] + arr[j][0] * arr[k][1] * arr[i + j][1]);
					}

					dp[j][i + j] = min;
				}
			}
		}

		System.out.println(dp[0][N - 1]);

	}
}