import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char[][] arr = new char[n + 2][n + 2];

		for (int i = 0; i < n + 2; i++) {
			for (int j = 0; j < n + 2; j++) {
				if (i >= 1 && i < n + 1 && j >= 1 && j < n + 1) {
					arr[i][j] = ' ';
				} else {
					arr[i][j] = '@';
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n + 2; i++) {
			for (int j = 0; j < n + 2; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}