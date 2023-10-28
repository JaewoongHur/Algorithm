import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();

		int x = a.length();
		int y = c.length();
		if (b.equals("+")) {
			if (x > y) {
				sb.append('1');

				for (int i = 1; i <= x - 1; i++) {
					if (i == x - y) {
						sb.append('1');
						continue;
					}
					sb.append('0');
				}
			} else if (x == y) {
				sb.append('2');
				for (int i = 1; i <= x - 1; i++) {
					sb.append('0');
				}
			} else {
				sb.append('1');

				for (int i = 1; i <= y - 1; i++) {
					if (i == y - x) {
						sb.append('1');
						continue;
					}
					sb.append('0');
				}
			}
		} else if (b.equals("*")) {
			sb.append('1');
			for (int i = 0; i < x + y - 2; i++) {
				sb.append('0');
			}
		}
		System.out.println(sb);
	}
}