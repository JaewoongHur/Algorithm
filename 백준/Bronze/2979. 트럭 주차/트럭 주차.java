import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int y1 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int z1 = Integer.parseInt(st.nextToken());
		int z2 = Integer.parseInt(st.nextToken());

		int ans = 0;

		for (int i = 1; i <= 100; i++) {
			int cnt = 0;
			if (i >= x1 && i < x2) {
				cnt++;
			}
			if (i >= y1 && i < y2) {
				cnt++;
			}
			if (i >= z1 && i < z2) {
				cnt++;
			}

			if (cnt == 1) {
				ans += a;
			} else if (cnt == 2) {
				ans += 2 * b;
			} else if (cnt == 3) {
				ans += 3 * c;
			}

		}
		System.out.println(ans);
	}
}