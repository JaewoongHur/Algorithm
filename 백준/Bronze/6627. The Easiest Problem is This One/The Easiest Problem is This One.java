import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;

		while (true) {
			s = br.readLine().trim();

			if (s.equals("0")) {
				break;
			}

			int sum = 0;

			for (int i = 0; i < s.length(); i++) {
				sum += s.charAt(i) - '0';
			}

			int n = Integer.parseInt(s);

			int a = 11;

			while (true) {
				int b = a * n;
				int c = 0;

				while (b != 0) {
					c += b % 10;
					b = b / 10;
				}

				if (c == sum) {
					break;
				}

				a++;
			}

			System.out.println(a);
		}
	}
}