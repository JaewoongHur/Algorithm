import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] A = new int[N][N];
			int cnt = 1;
			A[0][0] = cnt;
			int a = 0;
			int b = 0;
			while (cnt != N * N) {
				while (b + 1 < N && A[a][b + 1] == 0) {
					b++;
					cnt++;
					A[a][b] = cnt;
				}
				while (a + 1 < N && A[a + 1][b] == 0) {
					a++;
					cnt++;
					A[a][b] = cnt;
				}
				while (b - 1 >= 0 && A[a][b - 1] == 0) {
					b--;
					cnt++;
					A[a][b] = cnt;
				}
				while (a - 1 < N && A[a - 1][b] == 0) {
					a--;
					cnt++;
					A[a][b] = cnt;
				}
			}
			bw.write("#" + i);
			bw.newLine();
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					bw.write(A[j][k] + " ");
				}
				bw.newLine();
			}
		}
		br.close();
		bw.close();
	}
}