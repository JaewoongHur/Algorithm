import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] arr = new char[n][m];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		a--;
		b--;

		char[][] map = new char[2 * n][2 * m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = arr[i][j];
			}
		}

		for (int i = n; i < 2 * n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = arr[2 * n - 1 - i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = m; j < 2 * m; j++) {
				map[i][j] = arr[i][2 * m - 1 - j];
			}
		}

		for (int i = n; i < 2 * n; i++) {
			for (int j = m; j < 2 * m; j++) {
				map[i][j] = arr[2 * n - 1 - i][2 * m - 1 - j];
			}
		}
		
		if(map[a][b] == '.') {
			map[a][b] = '#';
		}else {
			map[a][b] = '.';
		}
		
		for(int i=0;i<2*n;i++) {
			for(int j=0;j<2*m;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}