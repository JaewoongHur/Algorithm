import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char[][] arr = new char[5 * n][5 * n];

		for (int i = 0; i < 5 * n; i++) {
			for (int j = 0; j < 5 * n; j++) {
				if ((i >= 0 && i < n) || (i >= 4 * n && i < 5 * n)) {
					if ((j >= 0 && j < n) || (j >= 4 * n && j < 5 * n)) {
						arr[i][j] = '@';
					} else {
						arr[i][j] = ' ';
					}
				} else if ((i >= n && i < 2 * n) || (i >= 3 * n && i < 4 * n)) {
					if (j >= 0 && j < n || (j >= 3 * n && j < 4 * n)) {
						arr[i][j] = '@';
					} else if (j >= n && j < 3 * n) {
						arr[i][j] = ' ';
					} else {
						arr[i][j] = 'b';
					}
				} else {
					if (j >= 0 && j < 3 * n) {
						arr[i][j] = '@';
					} else {
						arr[i][j] = 'b';
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5 * n; i++) {
			for (int j = 0; j < 5 * n; j++) {
				if(arr[i][j]=='b') continue;
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}