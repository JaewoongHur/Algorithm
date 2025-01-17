import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int ans = 0;

		for (int i = 1; i * i <= 2 * n; i++) {
			if (2 * n % i == 0) {
				int j = 2 * n / i;

				if ((i + j - 1) % 2 == 0 && (-i + j + 1) % 2 == 0) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
	}
}