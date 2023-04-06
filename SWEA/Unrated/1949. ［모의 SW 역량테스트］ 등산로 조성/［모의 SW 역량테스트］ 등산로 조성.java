import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int N, K, max;
	static int[][] arr, mtpeak;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			max = Integer.MIN_VALUE;
			int maxHeight = 0;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					maxHeight = Math.max(maxHeight, arr[i][j]);
				}
			}
			mtpeak = new int[6][2];
			for (int i = 1; i < 6; i++) {
				mtpeak[i][0] = Integer.MIN_VALUE;
				mtpeak[i][1] = Integer.MIN_VALUE;
			}
			int a = 1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == maxHeight) {
						mtpeak[a][0] = i;
						mtpeak[a][1] = j;
						a++;
					}
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int height = arr[i][j];
					for (int k = 1; k <= K; k++) {
						arr[i][j] -= k;
						for (int l = 1; l < a; l++) {
							if(arr[mtpeak[l][0]][mtpeak[l][1]] != maxHeight) {
								continue;
							}
							dfs(mtpeak[l][0],mtpeak[l][1],1);
							
						}
						arr[i][j] = height;
					}
				}
			}
			sb.append("#"+tc+" ").append(max).append("\n");
		}
		System.out.println(sb);
	}

	private static void dfs(int r, int c, int cnt) {
		boolean finish = false;
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (!boundaryCheck(nr, nc) || arr[nr][nc] >= arr[r][c]) {
				continue;
			}

			dfs(nr, nc, cnt + 1);
			finish = true;
		}
		
		if (!finish) {
			max = Math.max(max, cnt);
			return;
		}

	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}

}