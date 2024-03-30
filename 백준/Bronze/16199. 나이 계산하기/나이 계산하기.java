import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int y1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int d1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int y2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());

		int a = 0;
		int b = 0;
		int c = 0;

		if (m1 == m2) {
			if (d1 <= d2) {
				a = y2 - y1;
			} else {
				a = y2 - y1 - 1;
			}
		} else if (m1 > m2) {
			a = y2 - y1 - 1;
		} else {
			a = y2 - y1;
		}

		b = y2 - y1 + 1;
		c = y2 - y1;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}