import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			String s = br.readLine();

			int k = 0;

			int m = s.length();

			for (int i = m - 1; i >= 1; i--) {
				if (s.charAt(i) >= s.charAt(i - 1)) {
					k = i;
					break;
				}
			}
			System.out.println("The longest decreasing suffix of " + s + " is " + s.substring(k, m));
		}
	}
}