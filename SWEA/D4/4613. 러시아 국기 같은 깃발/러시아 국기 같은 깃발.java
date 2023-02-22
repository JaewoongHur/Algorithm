import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			char[][] A = new char[N][M];
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				for (int j = 0; j < M; j++) {
					A[i][j] = s.charAt(j);
				}
			}
			
			int min = Integer.MAX_VALUE;
			for (int L = 0; L <= N - 3; L++) {
				for (int k = 1; k + L <= N - 2; k++) {
					int cB = 0;
					int cW = 0;
					int cR = 0;
					for (int r = k; r <= k + L; r++) {
						for (int c = 0; c < M; c++) {
							if (A[r][c] != 'B') {
								cB++;
							}
						}
					}

					for (int r = k - 1; r >= 0; r--) {
						for (int c = 0; c < M; c++) {
							if (A[r][c] != 'W') {
								cW++;
							}
						}
					}
					for (int r = k + L + 1; r <= N - 1; r++) {
						for (int c = 0; c < M; c++) {
							if (A[r][c] != 'R') {
								cR++;
							}
						}
					}
					min = Math.min(min, cB + cW + cR);
				}
			}
			System.out.println("#" + t + " " + min);
		}
	}
}