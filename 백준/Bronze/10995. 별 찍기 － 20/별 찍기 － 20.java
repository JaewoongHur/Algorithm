import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		char[][] arr = new char[n][2 * n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n; j++) {
				if ((i + j) % 2 == 0) {
					arr[i][j] = '*';
				} else {
					arr[i][j] = ' ';
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n;j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}