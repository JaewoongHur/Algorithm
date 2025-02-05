import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());
		int dm = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken());
		int dh = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(br.readLine());

		int total = 0;

		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int ta = 0;
			int tb = 0;

			for (int i = 0; i < a; i++) {
				int t = m - i * dm;
				if (t <= 0) {
					break;
				}
				ta += t;
			}

			for (int i = 0; i < b; i++) {
				int t = h - i * dh;
				if (t <= 0) {
					break;
				}
				tb += t;
			}

			total += Math.max(ta, tb);
		}
		System.out.println(total);
	}
}