import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N;
	static int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1 };
	static boolean[][] queen;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		queen = new boolean[N][N];
		cnt = 0;
		queenSearch(0);
		System.out.println(cnt);
	}

	public static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}

	public static void queenSearch(int c) {
		if (c == N) {
			cnt++;
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(queenCheck(i,c)) {
				queen[i][c] = true;
				queenSearch(c+1);
				queen[i][c] = false;
			}
		}
	}

	public static boolean queenCheck(int r, int c) {
		for (int i = 0; i < N; i++) {
			if (queen[r][i] || queen[i][c]) {
				return false;
			}
		}
		for (int i = 0; i < 8; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			while (boundaryCheck(nr, nc)) {
				if (queen[nr][nc]) {
					return false;
				}
				nr += dr[i];
				nc += dc[i];
			}
		}
		return true;
	}

}