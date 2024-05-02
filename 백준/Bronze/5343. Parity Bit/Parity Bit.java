import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {

			s = br.readLine();

			int a = 0;

			int m = s.length();

			int l = m / 8;

			for (int i = 0; i < l; i++) {
				int b = 0;
				for (int j = 8 * i + 0; j < 8 * i + 7; j++) {
					if (s.charAt(j) == '1') {
						b++;
					}
				}

				if ((b % 2 == 0 && s.charAt(8 * i + 7) == '1') || (b % 2 == 1 && s.charAt(8 * i + 7) == '0')) {
					a++;
				}
			}
			System.out.println(a);
		}
	}
}