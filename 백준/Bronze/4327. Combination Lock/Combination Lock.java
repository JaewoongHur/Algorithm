import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String s;
		while (true) {
			s = br.readLine();
			if (s.equals("0 0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			int x = 1080;

			if (b > a) {
				x += (a + 40 - b)*9;
			} else {
				x += (a - b)*9;
			}

			if (b > c) {
				x += (40 - b + c)*9;
			} else {
				x += (c - b)*9;
			}

			if (d > c) {
				x += (c + 40 - d)*9;
			} else {
				x += (c - d)*9;
			}
			
			sb.append(x).append('\n');
		}
		System.out.println(sb);
	}
}