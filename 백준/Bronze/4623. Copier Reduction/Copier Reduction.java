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

			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			double d = Double.parseDouble(st.nextToken());

			double x = c / a;
			double y = d / a;
			double z = c / b;
			double w = d / b;

			boolean xp = true;
			boolean yp = true;
			boolean zp = true;
			boolean wp = true;

			if (b * x > d) {
				xp = false;
			}

			if (b * y > c) {
				yp = false;
			}

			if (a * z > d) {
				zp = false;
			}

			if (a * w > c) {
				wp = false;
			}

			double max = 0;

			if (xp) {
				if (max < x) {
					max = x;
				}
			}

			if (yp) {
				if (max < y) {
					max = y;
				}
			}

			if (zp) {
				if (max < z) {
					max = z;
				}
			}

			if (wp) {
				if (max < w) {
					max = w;
				}
			}

			if ((int) (100*max) > 100) {
				System.out.println("100%");
			} else if ((int) (100*max) < 1) {
				System.out.println("1%");
			} else {
				System.out.println((int) (100*max) + "%");
			}

		}

	}
}