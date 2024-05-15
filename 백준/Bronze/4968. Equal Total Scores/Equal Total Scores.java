import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int a = 0;
			int b = 0;

			int[] A = new int[n];
			int[] B = new int[m];

			for (int i = 0; i < n; i++) {
				A[i] = Integer.parseInt(br.readLine());

				a += A[i];
			}

			for (int i = 0; i < m; i++) {
				B[i] = Integer.parseInt(br.readLine());

				b += B[i];
			}
			
			if (Math.abs(a - b) % 2 == 1) {
				sb.append(-1).append('\n');
				continue;
			}

			int diff = (a - b) / 2;

			Arrays.sort(A);
			Arrays.sort(B);

			int x = -1;
			int y = -1;

			int min = Integer.MAX_VALUE;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (A[i] - B[j] == diff) {
						if (A[i] + B[j] < min) {
							min = A[i] + B[j];
							x = A[i];
							y = B[j];
						}
					}
				}
			}
			
			if(x == -1 && y==-1) {
				sb.append(-1).append('\n');
			}else {
				sb.append(x).append(' ').append(y).append('\n');
			}
		}

		System.out.println(sb);

	}
}