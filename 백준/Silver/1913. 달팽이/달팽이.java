import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[][] A = new int[N][N];
		int a = N / 2;
		int b = N / 2;
		int s = 1;
		int k = 1;
		A[a][b] = s;
		while (A[0][0] == 0) {
			a--;
			s++;
			A[a][b] = s;
			for (int j = 0; j < 4; j++) {
				int[] dr = { -k, k, k, -k };
				int[] dc = { k, k, -k, -k };
				int nr = N / 2 + dr[j];
				int nc = N / 2 + dc[j];
				while (A[nr][nc] == 0) {
					if (a < nr) {
						a++;
						s++;
						A[a][b] = s;
					} else if (a > nr) {
						a--;
						s++;
						A[a][b] = s;
					} else if (b < nc) {
						b++;
						s++;
						A[a][b] = s;
					} else if (b > nc) {
						b--;
						s++;
						A[a][b] = s;
					}
				}
			}
			k++;
		}
		int x = 0;
		int y = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.write(A[i][j] + " ");
				if (A[i][j] == M) {
					x = i + 1;
					y = j + 1;
				}
			}
			bw.newLine();
		}
		bw.write(x + " " + y);
		br.close();
		bw.close();
	}
}