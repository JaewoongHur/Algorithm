import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			double p = Double.parseDouble(st.nextToken());
			double q = Double.parseDouble(st.nextToken());

			double f = p * q / (p + q);

			System.out.printf("f = %.1f\n" ,f);
		}
	}
}