import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		char[][] arr = new char[3 * n][3 * n];

		for (int i = 0; i < 3 * n; i++) {
			for (int j = 0; j < 3 * n; j++) {
				if (i >= 0 && i < n) {
					if (j >= n && j < 2*n) {
						arr[i][j] = 'x';
					} else {
						arr[i][j] = '*';
					}
				} else if (i >= n && i < 2 * n) {
					if (j >= 0 && j < n) {
						arr[i][j] = ' ';
					} else {
						arr[i][j] = 'x';
					}
				} else {
					if (j >= n && j < 2 * n) {
						arr[i][j] = ' ';
					} else {
						arr[i][j] = '*';
					}
				}
			}
		}

		for (int i = 0; i < 3 * n; i++) {
			for (int j = 0; j < 3 * n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}