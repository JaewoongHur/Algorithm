import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int sw = Integer.parseInt(br.readLine());
		int[] A = new int[sw];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < sw; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 1) {
				for (int j = 1; j <= sw / b; j++) {
					A[b * j - 1] = (A[b * j - 1] + 1) % 2;
				}
			} else {
				A[b - 1] = (A[b - 1] + 1) % 2;
				int k = 1;
				while (b - 1 - k >= 0 && b - 1 + k < sw && A[b - 1 - k] == A[b - 1 + k]) {
					A[b - 1 - k] = (A[b - 1 - k] + 1) % 2;
					A[b - 1 + k] = (A[b - 1 + k] + 1) % 2;
					k++;
				}
			}
		}
		for (int i = 1; i <= sw; i++) {
			bw.write(A[i - 1] + " ");
			if (i % 20 == 0) {
				bw.newLine();
			}
		}
		br.close();
		bw.close();
	}
}