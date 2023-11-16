import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			int ans = 0;
			int idx = 2;
			while (idx <= n) {
				int k = n;
				while (true) {
					if (k == 0) {
						break;
					}

					if (k % idx == 0) {
						k /= idx;
						ans++;
					} else {
						break;
					}
				}
				idx++;
			}
			System.out.println(ans);
		}

	}
}