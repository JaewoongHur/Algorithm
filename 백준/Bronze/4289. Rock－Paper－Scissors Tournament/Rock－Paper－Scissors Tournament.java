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
			if (s.equals("0")) {
				break;
			}

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			double[] win = new double[n + 1];
			double[] lose = new double[n + 1];

			for (int i = 0; i < k * n * (n - 1) / 2; i++) {
				st = new StringTokenizer(br.readLine());

				int a = Integer.parseInt(st.nextToken());
				String x = st.nextToken();
				int b = Integer.parseInt(st.nextToken());
				String y = st.nextToken();

				if (x.equals("rock") && y.equals("paper")) {
					win[b]++;
					lose[a]++;
				} else if (x.equals("rock") && y.equals("scissors")) {
					win[a]++;
					lose[b]++;
				} else if (x.equals("paper") && y.equals("scissors")) {
					win[b]++;
					lose[a]++;
				} else if (x.equals("paper") && y.equals("rock")) {
					win[a]++;
					lose[b]++;
				} else if (x.equals("scissors") && y.equals("paper")) {
					win[a]++;
					lose[b]++;
				} else if (x.equals("scissors") && y.equals("rock")) {
					win[b]++;
					lose[a]++;
				}
			}

			for (int i = 1; i <= n; i++) {
				if (win[i] == 0 && lose[i] == 0) {
					System.out.println("-");
				} else {
					double avg = win[i] / (win[i] + lose[i]);
					System.out.printf("%.3f\n", avg);
				}
			}
			System.out.println();
		}
	}
}