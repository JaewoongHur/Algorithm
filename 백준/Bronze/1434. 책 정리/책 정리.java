import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] A = new int[n];
		int[] B = new int[m];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}

		int idx = 0;

		for (int i = 0; i < n; i++) {
			while (idx < m && A[i] >= B[idx]) {
				A[i] -= B[idx];
				idx++;
			}
		}

		int s = 0;

		for (int i = 0; i < n; i++) {
			s += A[i];

		}
		System.out.println(s);
	}
}