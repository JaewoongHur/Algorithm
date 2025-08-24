import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine().trim());

		int a = 0;
		int b = 0;

		for (int end = 0; end < n; end++) {
			st = new StringTokenizer(br.readLine());

			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			double[] A = new double[m];
			double[] B = new double[k];

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());

				double x = Double.parseDouble(st.nextToken());
				double y = Double.parseDouble(st.nextToken());
				A[i] = Math.sqrt(x * x + y * y);
			}

			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());

				double x = Double.parseDouble(st.nextToken());
				double y = Double.parseDouble(st.nextToken());
				B[i] = Math.sqrt(x * x + y * y);
			}

			Arrays.sort(A);
			Arrays.sort(B);

			if (A[0] < B[0]) {
				for (int i = 0; i < m; i++) {
					if (A[i] < B[0]) {
						a++;
					}
				}
			} else if (A[0] > B[0]) {
				for (int i = 0; i < k; i++) {
					if (B[i] < A[0]) {
						b++;
					}
				}
			}
		}
		System.out.println(a + ":" + b);
	}
}