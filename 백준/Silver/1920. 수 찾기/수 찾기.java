import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);

		int[] B = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(binarySearch(A, B[i])));
			bw.newLine();
		}
		br.close();
		bw.close();
	}

	public static int binarySearch(int[] A, int x) {
		int a = 0;
		int b = A.length - 1;

		while (a <= b) {

			int m = (a + b) / 2;

			if (x < A[m]) {
				b = m - 1;
			} else if (x > A[m]) {
				a = m + 1;
			} else {
				return 1;
			}
		}
		return 0;
	}

}