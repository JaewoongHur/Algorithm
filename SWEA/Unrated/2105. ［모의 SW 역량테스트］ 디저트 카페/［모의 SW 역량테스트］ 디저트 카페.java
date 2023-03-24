import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	static int N;
	static int[][] A;
	static int max;
	static int[] dr = { 1, 1, -1, -1 };
	static int[] dc = { 1, -1, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			A = new int[N][N];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			max = -1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					List<Integer> dessertList = new ArrayList<>();
					dessertList.add(A[i][j]);
					dfs(i, j, i, j, 0, 1, dessertList);
				}
			}

			sb.append("#" + t + " " + max).append("\n");
		}
		System.out.println(sb);
	}
	static boolean boundaryCheck(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}

	static void dfs(int r, int c, int sr, int sc, int d, int count, List<Integer> dessertList) {
		if (d == 4)
			return;

		int nr = r + dr[d];
		int nc = c + dc[d];

		if(!boundaryCheck(nr,nc)) {
			return;
		}

		if (!dessertList.contains(A[nr][nc])) {
			List<Integer> newList = new ArrayList<>(dessertList);
			newList.add(A[nr][nc]);
			dfs(nr, nc, sr, sc, d, count + 1, newList);
			dfs(nr, nc, sr, sc, d + 1, count + 1, newList);
		} else if (nr == sr && nc == sc && count >= 4) {
			max = Math.max(max, count);
		}
	}

}