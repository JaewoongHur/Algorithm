import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			int a = Integer.parseInt(s);

			int max = a;

			while (a != 1) {
				if (a % 2 == 0) {
					a /= 2;
				} else {
					a = 3 * a + 1;
				}

				max = Math.max(a, max);

			}

			System.out.println(max);
		}
	}
}