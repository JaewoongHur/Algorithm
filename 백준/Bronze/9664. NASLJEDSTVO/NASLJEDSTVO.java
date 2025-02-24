import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int x = m+1; x <= m + m / (n - 1); x++) {

			int r = x / n;

			if (x - r == m) {
				min = Math.min(min, x);
				max = Math.max(max, x);
			}
		}

		System.out.println(min + " " + max);
	}
}