import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());

		char[][] arr = new char[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = '.';
			}
		}

		for (int cover = 0; cover < t; cover++) {
			st = new StringTokenizer(br.readLine());
			int r1 = Integer.parseInt(st.nextToken());
			int c1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());

			char a = (char) ('a' + cover);

			for (int i = r1; i <= r2; i++) {
				for (int j = c1; j <= c2; j++) {
					if (i == r1 || i == r2) {
						arr[i - 1][j - 1] = a;
					} else {
						if (j == c1 || j == c2) {
							arr[i - 1][j - 1] = a;
						}
					}
				}
			}
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}