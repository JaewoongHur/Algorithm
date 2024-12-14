import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			int n = Integer.parseInt(s);

			st = new StringTokenizer(br.readLine());

			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());

			double d = 0;

			if (b - a == c - b) {
				d = (n * (2*a + (n - 1) * (b - a))) / 2;
			} else if (b / a == c / b && b % a == 0 && c % b == 0) {
				d = a*(Math.pow(b / a, n)-1) / (b / a - 1);
			}

			System.out.println((int) d);

		}
	}
}