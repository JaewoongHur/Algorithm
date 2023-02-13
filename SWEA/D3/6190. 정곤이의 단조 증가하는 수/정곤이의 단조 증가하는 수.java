import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int[] A;
		int[] B;
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			A = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				A[j] = Integer.parseInt(st.nextToken());
			}
			int M = N * (N + 1) / 2;
			B = new int[M];
			int s = 0;
			for (int j = 0; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					int a = A[j] * A[k];
					int c = a;
					while (c != 0 && (c / 10) % 10 <= c % 10) {
						c = c / 10;
					}
					if (c == 0) {
						B[s++] = a;
					}
				}
			}
			if (s >= 1) {
				Arrays.sort(B);
				bw.write("#" + i + " " + B[M - 1]);
				bw.newLine();
			} else {
				bw.write("#" + i + " " + -1);
				bw.newLine();
			}
		}
		br.close();
		bw.close();
	}
}