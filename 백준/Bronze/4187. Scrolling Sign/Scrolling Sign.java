import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			String[] s = br.readLine().split(" ");
			int k = Integer.parseInt(s[0]);
			int w = Integer.parseInt(s[1]);

			String a = br.readLine();

			int ans = k;
			
			for (int i = 0; i < w - 1; i++) {
				String b = br.readLine();
				boolean pass = false;
				for (int j = k - 1; j >= 0; j--) {
					String x = a.substring(k - j - 1, k);
					String y = b.substring(0, j + 1);

					if (x.equals(y)) {
						ans += k - y.length();
						pass = true;
						break;
					}
				}
				
				if(!pass) {
					ans += k;
				}
				
				a = b;
			}

			System.out.println(ans);
		}
	}
}