import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0 0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int cal = Integer.parseInt(st.nextToken());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			double x = a + 0.5;
			double y = b + 0.5;
			double z = c + 0.5;

			double x2 = a - 0.5;
			double y2 = b - 0.5;
			double z2 = c - 0.5;

			if (x2 <= 0) {
				x2 = 0.0d;
			}
			if (y2 <= 0) {
				y2 = 0.0d;
			}
			if (z2 <= 0) {
				z2 = 0.0d;
			}

			double d = x * 9 + y * 4 + z * 4;
			double d2 = x2 * 9 + y2 * 4 + z2 * 4;
			
			if (cal >= (int) Math.round(d2) && cal < (int) Math.round(d)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}