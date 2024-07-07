import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n][m];

		for (int r = 0; r < n; r++) {
			String s = br.readLine();
			for (int c = 0; c < m; c++) {
				arr[r][c] = s.charAt(c);
			}
		}

		int t = Math.max(n, m);

		int ans = 0;

		out: for (int k = t; k >= 0; k--) {
			for (int r = 0; r + k < n; r++) {
				for (int c = 0; c + k < m; c++) {
					if (arr[r][c] == arr[r][c + k] && arr[r][c + k] == arr[r + k][c]
							&& arr[r + k][c] == arr[r + k][c + k] && arr[r + k][c + k] == arr[r][c]) {
						ans = k;
						break out;
					}

				}
			}

		}

		System.out.println((ans + 1) * (ans + 1));

	}
}