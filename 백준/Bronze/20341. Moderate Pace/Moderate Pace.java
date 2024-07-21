import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[3][n];

		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			int a = arr[0][i];
			int b = arr[1][i];
			int c = arr[2][i];

			int max = a;
			max = Math.max(max, b);
			max = Math.max(max, c);

			int k = 0;

			if (max == a) {
				if (b > c) {
					k = b;
				} else {
					k = c;
				}
			} else if (max == b) {
				if (a > c) {
					k = a;
				} else {
					k = c;
				}
			} else if (max == c) {
				if (a > b) {
					k = a;
				} else {
					k = b;
				}
			}
			System.out.print(k + " ");
		}
	}
}