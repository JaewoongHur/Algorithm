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

			String s = st.nextToken();
			int n = Integer.parseInt(st.nextToken());

			int l = s.length();

			int ans = 0;

			for (int i = 0; i < l; i++) {
				int a = 0; int b = 0;
				for (int j = i; j < l; j++) {
					if (s.charAt(j) == 'a' || s.charAt(j) == 'i' || s.charAt(j) == 'e' || s.charAt(j) == 'o'
							|| s.charAt(j) == 'u') {
						a = 0;
					} else {
						a++;
						b = Math.max(a, b);
					}

					if (b >= n) {
						ans++;
					}
				}
			}

			System.out.println("Case #" + tc + ": " + ans);

		}
	}
}
