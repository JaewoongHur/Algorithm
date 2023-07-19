import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		long[] arr = new long[n];

		int ans = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}

		int[] right = new int[n];
		int[] left = new int[n];

		// right
		for (int i = 0; i < n - 1; i++) {
			int cnt = 0;
			out: for (int j = i + 1; j < n; j++) {

				if (j == i + 1) {
					cnt++;
					continue;
				}

				for (int k = i + 1; k < j; k++) {
					if ((arr[k] - arr[i]) * (j - i) >= (arr[j] - arr[i]) * (k - i)) {
						continue out;
					}
				}
				cnt++;
			}

			right[i] = cnt;
		}
		// left
		for (int i = n - 1; i >= 1; i--) {
			int cnt = 0;
			out: for (int j = i - 1; j >= 0; j--) {

				if (j == i - 1) {
					cnt++;
					continue;
				}
				for (int k = i - 1; k > j; k--) {
					if ((arr[k] - arr[i]) * (i - j) >= (arr[i] - arr[j]) * (k - i)) {
						continue out;
					}
				}
				cnt++;
			}

			left[i] = cnt;
		}

		for (int i = 0; i < n; i++) {
			if (ans < right[i] + left[i]) {
				ans = right[i] + left[i];
			}
		}
		System.out.println(ans);
	}
}