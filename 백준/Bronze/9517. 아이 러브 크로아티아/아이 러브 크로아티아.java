import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int t = 0;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String s = st.nextToken();

			t += a;

			if (t >= 210) {
				System.out.println(n);
				break;
			}

			if (s.equals("T")) {
				n++;

				if (n == 9) {
					n = 1;
				}
			}
		}
	}
}