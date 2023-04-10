import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, cnt;
	static int[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());

		map = new int[N + 1][N + 1];

		for (int r = 1; r <= N; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 1; c <= N; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
			}
		}

		cnt = 0;
		move(1, 2, 0);
		System.out.println(cnt);
	}

	private static boolean boundaryCheck(int r, int c) {
		return r >= 1 && r <= N && c >= 1 && c <= N;
	}

	private static void move(int r, int c, int dir) {
		if (!boundaryCheck(r, c) || map[r][c] == 1) {
			return;
		}

		if (r == N && c == N) {
			cnt++;
			return;
		}

		switch (dir) {
		case 0:
			move(r, c + 1, 0);

			if (r + 1 <= N && c + 1 <= N && map[r][c + 1] == 0 && map[r + 1][c] == 0 && map[r + 1][c + 1] == 0) {
				move(r + 1, c + 1, 2);
			}
			break;

		case 1:
			move(r + 1, c, 1);
			if (r + 1 <= N && c + 1 <= N && map[r][c + 1] == 0 && map[r + 1][c] == 0 && map[r + 1][c + 1] == 0) {
				move(r + 1, c + 1, 2);
			}

			break;

		case 2:
			move(r,c+1,0);
			move(r+1,c,1);
			if(r+1<=N && c+1<=N && map[r][c+1] == 0 && map[r+1][c]==0 && map[r+1][c+1]==0) {
				move(r+1,c+1,2);
				}
			break;
		}

	}

}