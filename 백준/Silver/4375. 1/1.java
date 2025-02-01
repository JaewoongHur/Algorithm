import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		while (true) {
			s = br.readLine();

			if (s == null) {
				break;
			}

			int n = Integer.parseInt(s);

			int k = 1;

			int cnt = 1;

			while (true) {
				if (k % n == 0) {
					break;
				}

				k = 10 * k + 1;

				k %= n;

				cnt++;
			}

			System.out.println(cnt);
		}
	}
}