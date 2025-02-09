import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (!((s = br.readLine()).equals("0"))) {
			int n = Integer.parseInt(s);

			int[] A = new int[n];
			int[] B = new int[n];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}

			int a = 0;
			int b = 0; // 점수 합
			boolean sA = false;
			boolean sB = false; // 스트릭 확인
			boolean bonus = false; // 추가 점수 지급 여부

			for (int i = 0; i < n; i++) {

				if (!bonus && i > 1) {
					if (A[i - 2] == A[i - 1] && A[i - 1] == A[i]) {
						sA = true;
					}

					if (B[i - 2] == B[i - 1] && B[i - 1] == B[i]) {
						sB = true;
					}
				}

				if (!bonus) {
					if (sA && sB) {
						bonus = true;
					} else {
						if (sA) {
							a += 30;
							bonus = true;
						}

						if (sB) {
							b += 30;
							bonus = true;
						}
					}
				}

				a += A[i];
				b += B[i];
			}

			if (a > b) {
				System.out.println("M");
			} else if (a == b) {
				System.out.println("T");
			} else if (a < b) {
				System.out.println("L");
			}
		}
	}
}