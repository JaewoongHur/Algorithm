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

			int n = st.countTokens();

			String[] list = new String[n];

			for (int i = 0; i < n; i++) {
				list[i] = st.nextToken();
			}

			String a = br.readLine();

			int p = 0;

			for (int i = 0; i < n; i++) {
				if (a.equals(list[i])) {
					p = i;
				}
			}

			int q = Integer.parseInt(br.readLine()) - 1;

			System.out.println(list[((p + q) % n)]);
		}
	}
}