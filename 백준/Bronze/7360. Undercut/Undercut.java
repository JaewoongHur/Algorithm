import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			int n = Integer.parseInt(s);

			int[] A = new int[n];
			int[] B = new int[n];

			st = new StringTokenizer(br.readLine());
			for (int r = 0; r < n; r++) {
				A[r] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int r = 0; r < n; r++) {
				B[r] = Integer.parseInt(st.nextToken());
			}

			int a = 0;
			int b = 0;

			for (int r = 0; r < n; r++) {
				if (A[r] > B[r]) {
					if (A[r] - B[r] == 1) {
						if (B[r] == 1) {
							b += 6;
						} else {
							b += A[r] + B[r];
						}
					} else {
						a += A[r];
					}

				} else if(B[r] > A[r]){
					if (B[r] - A[r] == 1) {
						if (A[r] == 1) {
							a += 6;
						} else {
							a += A[r] + B[r];
						}
					} else {
						b += B[r];
					}
				}
			}

			System.out.println("A has " + a + " points. B has " + b + " points.\n");
		}
	}
}