import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int w = Integer.parseInt(br.readLine().trim());

		int n = Integer.parseInt(br.readLine().trim());

		double[] grade = new double[n];
		double[] weight = new double[n];

		double tw = 0;
		double sw = 0;

		boolean pass = true;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());

			grade[i] = a;
			weight[i] = b;
			sw += a * b;
			tw += b;
			if (a < 5.8) {
				pass = false;
			}
		}

		double x = (8.0 * (tw + w) - sw) / w;
		x = Math.ceil(10 * x) / 10;
		
		if (pass) {
			if (x > 10.0) {
				System.out.println("IMPOSSIBLE");
			} else if (x < 5.8) {
				double avg = (sw + 5.8 * w) / (tw + w);
				if (avg >= 8.0) {
					System.out.println("5.8");
				} else {
					System.out.println("IMPOSSIBLE");
				}
			} else {
				System.out.println(x);
			}
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}