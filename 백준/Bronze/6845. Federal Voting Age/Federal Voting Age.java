import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());

			int y = Integer.parseInt(st.nextToken());

			int m = Integer.parseInt(st.nextToken());

			int d = Integer.parseInt(st.nextToken());

			if (y < 1989) {
				System.out.println("Yes");
				continue;
			} else if (y == 1989) {
				if (m < 2) {
					System.out.println("Yes");
					continue;
				} else if (m == 2) {
					if (d < 28) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} else {
					System.out.println("No");
				}

			} else {
				System.out.println("No");
				continue;
			}
		}
	}
}