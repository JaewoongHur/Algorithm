import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			double d = Double.parseDouble(br.readLine());

			double s = Math.sqrt(d);

			int t = (int) s - 1;

			while (t * (t + 1) <= d) {
				t++;
			}
			t--;
			System.out.println(t);
		}
	}
}