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

			if (s.equals("0 0 0 0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int total = 0;
			int door = 0;

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());

				int d1 = Integer.parseInt(st.nextToken());
				int d2 = Integer.parseInt(st.nextToken());

				door += d1 * d2;
			}

			total = n * (w * l + 2 * (w + l) * h - door);

			int num = total % a == 0 ? total / a : total / a + 1;

			System.out.println(num);

		}
	}
}