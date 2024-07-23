import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine().trim());

		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine().trim(), ":");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int x = 0;
			int y = 0;

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (a + i > b + j) {
						x++;
					} else if (b + j > a + i) {
						y++;
					} else {
						if (i > b) {
							x++;
						} else if (b > i) {
							y++;
						}
					}
				}
			}
			System.out.println(x + " " + y);
		}
	}
}