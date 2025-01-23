import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());

		int ans = 0;

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());

			if (p == 1) {
				if (a > 0) {
					ans += a;
				}
			} else if (p == 2) {
				ans += a * a;
			} else {
				if (a > 0) {
					ans += a * a * a;
				}
			}
		}
		System.out.println(ans);
	}
}