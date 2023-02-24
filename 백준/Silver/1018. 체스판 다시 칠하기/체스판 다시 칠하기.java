import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		char[][] arr = new char[M][N];
		
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		char[][] chess = new char[8][8];
		int min = Integer.MAX_VALUE;
		for (int a = 0; a <= M - 8; a++) {
			for (int b = 0; b <= N - 8; b++) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						chess[i][j] = arr[i + a][j + b];
					}
				}
				int cnt1 = 0;
				int cnt2 = 0;
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if ((i + j) % 2 == 0) {
							if (chess[i][j] == 'W') {
								cnt1++;
							} else {
								cnt2++;
							}
						} else {
							if (chess[i][j] == 'B') {
								cnt1++;
							} else {
								cnt2++;
							}
						}
					}
				}
					min = Math.min(min, Math.min(cnt1, cnt2));
				}
		}
		System.out.println(min);
	}
}