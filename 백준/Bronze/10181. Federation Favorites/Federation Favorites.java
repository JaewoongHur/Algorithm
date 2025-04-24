import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("-1")) {
				break;
			}

			int n = Integer.parseInt(s);

			boolean[] arr = new boolean[n];
			arr[1] = true;
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					arr[i] = true;
					arr[n / i] = true;
				}
			}

			int perfect = 0;

			for (int i = 1; i < n; i++) {
				if (arr[i]) {
					perfect += i;
				}
			}

			if (perfect == n) {

				System.out.print(n + " = 1");

				for (int i = 2; i < n; i++) {
					if (arr[i]) {
						System.out.print(" + " + i);
					}
				}

				System.out.println();
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
}