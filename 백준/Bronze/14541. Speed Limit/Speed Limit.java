import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		while (true) {
			s = br.readLine().trim();
			if (s.equals("-1")) {
				break;
			}

			int n = Integer.parseInt(s);

			int t = 0;

			int total = 0;

			for (int i = 0; i < n; i++) {
				String[] a = br.readLine().split(" ");
				int v = Integer.parseInt(a[0]);
				int p = Integer.parseInt(a[1]);

				total += v * (p - t);
				t = p;
			}
			System.out.println(total + " miles");
		}
	}
}