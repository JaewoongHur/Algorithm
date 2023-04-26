import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int M, N;
	static int[][] map, dp;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static boolean visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		map = new int[M][N];
		dp = new int[M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				dp[i][j] = -1;
			}
		}

		dfs(0, 0);

		System.out.println(dp[0][0]);
	}

	private static boolean boundary(int r, int c) {
		return r >= 0 && r < M && c >= 0 && c < N;
	}

	private static int dfs(int r, int c) {

		if (r == M - 1 && c == N - 1) {
			return 1;
		}
		if (dp[r][c] != -1) {
			return dp[r][c];
		}

		dp[r][c] = 0;
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (!boundary(nr, nc) || map[nr][nc] >= map[r][c]) {
				continue;
			}
			int k = dfs(nr, nc);
			dp[r][c] += k;
		}

		return dp[r][c];
	}

}