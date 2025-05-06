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
				if (i >= 0 && i < 4 * n && j >= 3 * n && j < 4 * n) {
					arr[i][j] = ' ';
				} else if (i >= n && i < 5 * n && j >= n && j < 2 * n) {
					arr[i][j] = ' ';
				} else {
					arr[i][j] = '@';
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5 * n; i++) {
			for (int j = 0; j < 5 * n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}