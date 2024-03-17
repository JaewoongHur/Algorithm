import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;

		while (true) {
			s = br.readLine();
			if (s.equals("0 0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int k = 0;

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			while (true) {
				if (a == b && b == c && c == d && d == a) {
					break;
				}
				
				int a1 = Math.abs(a - b);
				int b1 = Math.abs(b - c);
				int c1 = Math.abs(c - d);
				int d1 = Math.abs(d - a);
				++k;
				
				if (!(a1 == b1 && b1 == c1 && c1 == d1 && d1 == a1)) {
					a = a1;
					b = b1;
					c = c1;
					d = d1;
				}else {
					break;
				}
			}
			sb.append(k).append('\n');
		}
		System.out.println(sb);
	}
}