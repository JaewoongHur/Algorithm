import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;

		int[] A = new int[] { 1, 2, 3, 3, 4, 10 };
		int[] B = new int[] { 1, 2, 2, 2, 3, 5, 10 };
		
		int n = Integer.parseInt(br.readLine());

		for (int t = 1; t <= n; t++) {
			int a = 0;
			int b = 0;

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < 6; i++) {
				int k = Integer.parseInt(st.nextToken());
				a += A[i] * k;
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 7; i++) {
				int k = Integer.parseInt(st.nextToken());
				b += B[i] * k;
			}

			if (a > b) {
				System.out.println("Battle " + t + ": Good triumphs over Evil");
			} else if (a < b) {
				System.out.println("Battle " + t + ": Evil eradicates all trace of Good");
			} else {
				System.out.println("Battle " + t + ": No victor on this battle field");
			}
		}
	}
}