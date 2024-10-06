import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine().trim());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double z1 = Double.parseDouble(st.nextToken());

			st = new StringTokenizer(br.readLine());

			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double z2 = Double.parseDouble(st.nextToken());

			double a = 0;

			a += x1 * y2 + y1 * z2 + z1 * x2 - (x1 * z2 + y1 * x2 + z1 * y2);

			if (a > 0) {
				System.out.println("ADAM");
			} else if (a == 0) {
				System.out.println("=");
			} else {
				System.out.println("GOSIA");
			}
		}
	}
}