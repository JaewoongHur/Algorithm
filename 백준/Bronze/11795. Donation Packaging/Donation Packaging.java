import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int sA = 0;
		int sB = 0;
		int sC = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			sA += a;
			sB += b;
			sC += c;

			int p = 0;

			if (sA >= 30 && sB >= 30 && sC >= 30) {
				p = Math.min(sA, Math.min(sB, sC));

				sA -= p;
				sB -= p;
				sC -= p;

			}

			if (p == 0) {
				System.out.println("NO");
			} else {
				System.out.println(p);
			}

		}
	}
}