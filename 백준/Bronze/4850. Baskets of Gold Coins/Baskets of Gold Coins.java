import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;

		while ((s = br.readLine()) != null) {

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			int r = Integer.parseInt(st.nextToken());

			int sum = (w * n * (n - 1)) / 2;

			int ans = (sum - r) / d;

			if (ans == 0) {
				System.out.println(n);
			} else {
				System.out.println(ans);
			}
		}
	}
}