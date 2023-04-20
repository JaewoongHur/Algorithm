import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		char[][] arr = new char[N][M];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		int min = 0;

		int row = 0;
		int col = 0;

		for (int r = 0; r < N; r++) {
			boolean check = true;
			for (int c = 0; c < M; c++) {
				if (arr[r][c] == 'X') {
					check = false;
				}
				
			}
			if(check) {
				row++;
			}
		}
		
		for(int r=0;r<M;r++) {
			boolean check =true;
			for(int c=0;c<N;c++) {
				if(arr[c][r] == 'X') {
					check = false;
				}
			}
			if(check) {
				col++;
			}
		}
		
		min = Math.max(row, col);
		System.out.println(min);
	}

}