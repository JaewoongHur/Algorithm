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
				if (i >= 0 && i < 4 * n && j >= n && j < 5 * n) {
					arr[i][j] = ' ';
				} else {
					arr[i][j] = '@';
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5 * n; i++) {
			for (int j = 0; j < 5 * n; j++) {
				if(arr[i][j]==' ') continue;
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}