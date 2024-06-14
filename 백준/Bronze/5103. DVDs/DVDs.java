import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String code = br.readLine().trim();
			if (code.equals("#")) {
				break;
			}

			StringTokenizer st = new StringTokenizer(br.readLine());

			int m = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());

			int n = Integer.parseInt(br.readLine().trim());

			int x = s;

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String a = st.nextToken();
				int b = Integer.parseInt(st.nextToken());

				if (a.equals("S")) {
					x -= b;
					if (x < 0) {
						x = 0;
					}
				} else if (a.equals("R")) {
					x += b;
					if (x > m) {
						x = m;
					}
				}
			}
			System.out.println(code + " " + x);
		}
	}
}