import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			double r = Double.parseDouble(st.nextToken());

			boolean[] bailout = new boolean[c + 1];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < b; i++) {
				int x = Integer.parseInt(st.nextToken());
				bailout[x] = true;
			}

			double sum = 0;

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int c_i = Integer.parseInt(st.nextToken());
				double p_i = Double.parseDouble(st.nextToken());

				if (bailout[c_i]) {
					sum += (int) Math.floor(p_i * r / 100.0d);
				}
			}

			System.out.println("Data Set " + tc + ":");
			System.out.println((int) sum);
			System.out.println();
		}
	}
}