import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[][] SB = new int[N + 1][M + 1];
		int[][] SW = new int[N + 1][M + 1];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			int sumB = 0;
			int sumW = 0;
			for (int j = 0; j < M; j++) {
				if ((i + j) % 2 == 0) {
					if (s.charAt(j) == 'B') {
						sumB++;
					} else {
						sumW++;
					}
				} else {
					if (s.charAt(j) == 'W') {
						sumB++;
					} else {
						sumW++;
					}
				}

				SB[i + 1][j + 1] = SB[i][j + 1] + sumB;
				SW[i + 1][j + 1] = SW[i][j + 1] + sumW;
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= N - K + 1; i++) {
			for (int j = 1; j <= M - K + 1; j++) {
				int b = SB[i + K - 1][j + K - 1] - SB[i + K - 1][j - 1] - SB[i - 1][j + K - 1] + SB[i - 1][j - 1];
				int w = SW[i + K - 1][j + K - 1] - SW[i + K - 1][j - 1] - SW[i - 1][j + K - 1] + SW[i - 1][j - 1];
				
				min = Math.min(min, b);
				min = Math.min(min, w);
			}
		}
		System.out.println(min);

	}
}