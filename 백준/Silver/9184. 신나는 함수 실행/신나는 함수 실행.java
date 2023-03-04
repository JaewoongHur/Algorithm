import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s;
		while (!(s = br.readLine()).equals("-1 -1 -1")) {
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			sb.append("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c) + "\n");
		}
		System.out.println(sb);
	}

	static int dp[][][] = new int[21][21][21];

	static int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		} else if (a > 20 || b > 20 || c > 20) {
			if(dp[20][20][20] == 0) {
			dp[20][20][20] = w(20, 20, 20);
			}
			return dp[20][20][20];
		} else if (a < b && b < c) {
			if(dp[a][b][c] == 0) {
			dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
			}
			return dp[a][b][c];
		} else {
			if(dp[a][b][c] == 0) {
			dp[a][b][c] =w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
			}
			return dp[a][b][c];
		}
	}

}