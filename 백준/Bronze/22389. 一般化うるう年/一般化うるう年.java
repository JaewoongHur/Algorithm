import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int[] arr = new int[n + 1];

			for (int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			int ans = 0;

			for (int i = a; i <= b; i++) {
				boolean pass = true;
				for (int j = 1; j <= n; j++) {
					if (i % arr[j] == 0) {
						if (j % 2 == 1) {
							ans++;
						}
						pass = false;
						break;
					}
				}
				if (pass) {
					if (n % 2 == 0) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}