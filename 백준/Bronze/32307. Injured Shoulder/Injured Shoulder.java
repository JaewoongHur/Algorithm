import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] d = new String[n];

		for (int i = 0; i < n; i++) {
			d[i] = br.readLine();
		}

		String[] c = new String[n * n];

		int idx = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				c[idx] = d[i] + d[j];
				idx++;
			}
		}

		int T = Integer.parseInt(br.readLine());

		out: for (int tc = 0; tc < T; tc++) {
			String s = br.readLine();

			for (int i = 0; i < n; i++) {
				if (s.equals(d[i])) {
					System.out.println(1);
					continue out;
				}
			}

			for (int i = 0; i < n * n; i++) {
				if (s.equals(c[i])) {
					System.out.println(2);
					continue out;
				}
			}
			System.out.println(0);
		}
	}
}