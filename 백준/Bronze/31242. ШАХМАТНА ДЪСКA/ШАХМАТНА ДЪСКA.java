import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[][] arr = new int[4][5];

		int x = 0;
		int y = 0;

		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 1) {
					x = i;
					y = j;
				}
			}
		}

		int[] dr = new int[] { -2, -1, 1, 2, 2, 1, -1, -2 };
		int[] dc = new int[] { 1, 2, 2, 1, -1, -2, -2, -1 };

		while (true) {
			boolean pass = false;

			for (int d = 0; d < 8; d++) {
				if(x+dr[d]>=4 || x+dr[d]<0 || y+dc[d]>=5 || y+dc[d]<0) continue;
				
				if(arr[x+dr[d]][y+dc[d]] == arr[x][y] + 1) {
					x = x + dr[d];
					y = y + dc[d];
					pass = true;
					break;
				}
			}
			
			if(!pass || arr[x][y] == 20) {
				break;
			}			
		}
		System.out.println(arr[x][y]);
	}
}