import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char[][] arr = new char[5 * n][5 * n];

		for (int i = 0; i < 5 * n; i++) {
			for (int j = 0; j < 5 * n; j++) {
				if ((i >= 0 && i < n) || (i >= 2 * n && i < 3 * n) || (i >= 4 * n && i < 5 * n)) {
					if (j >= n && j < 4 * n) {
						arr[i][j] = ' ';
					}else {
						arr[i][j] = '@';
					}
				}else {
					arr[i][j] = '@';
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<5*n;i++) {
			for(int j=0;j<5*n;j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}