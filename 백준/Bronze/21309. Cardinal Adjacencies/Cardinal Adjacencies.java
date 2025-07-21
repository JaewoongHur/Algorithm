import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] map = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int a = 0;
		int b = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j] == 0) continue;
				if (j + 1 < m && map[i][j+1] == 1) {
					a++;
				}
				
				if(i + 1 < n && map[i+1][j] == 1) {
					a++;
				}
				
				if(i - 1 >= 0 && j + 1 < m && map[i-1][j+1] == 1) {
					b++;
				}
				
				if(i + 1 < n && j + 1 < m && map[i+1][j+1] == 1) {
					b++;
				}
			}
		}
		
		System.out.println(a + " " +(a+b));
	}
}
