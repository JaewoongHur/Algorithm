import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char[][] arr = new char[3 * n][4 * n];

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 3 * n; i++) {
			for (int j = 0; j < 4 * n; j++) {
				if (i >= 0 && i < n && j >= 0 && j < n) {
					arr[i][j] = 'G';
				} else if (i >= n && i < 2 * n && j >= n && j < 2 * n) {
					arr[i][j] = 'I';
				} else if (i >= n && i < 2 * n && j >= 3 * n && j < 4 * n) {
					arr[i][j] = 'T';
				} else if (i >= 2 * n && i < 3 * n && j >= 2 * n && j < 3 * n) {
					arr[i][j] = 'S';
				} else {
					arr[i][j] = '.';
				}
			}
		}

		for (int i = 0; i < 3 * n; i++) {
			for (int j = 0; j < 4 * n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);

	}
}