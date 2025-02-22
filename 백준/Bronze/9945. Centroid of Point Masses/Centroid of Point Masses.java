import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int tc = 1;

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n < 0) {
				break;
			}

			double mx = 0;
			double my = 0;
			double M = 0;

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());

				double x = Double.parseDouble(st.nextToken());
				double y = Double.parseDouble(st.nextToken());
				double m = Double.parseDouble(st.nextToken());

				M += m;
				mx += m * x;
				my += m * y;
			}

			double a = mx / M;
			double b = my / M;
			
			System.out.printf("Case " + tc + ": " + "%.2f ", a);
			System.out.printf("%.2f\n", b);
			
			tc++;
			br.readLine();
		}
	}
}