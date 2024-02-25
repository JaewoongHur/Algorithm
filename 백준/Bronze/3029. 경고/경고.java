import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int x = 0;
		int y = 0;
		int z = 0;

		st = new StringTokenizer(br.readLine(), ":");

		int h1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int s1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), ":");
		int h2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());

		if (h2 > h1) {
			int a = h2 * 3600 + m2 * 60 + s2;

			int b = h1 * 3600 + m1 * 60 + s1;

			int t = a - b;

			x = t / 3600;

			y = (t % 3600) / 60;

			z = t % 60;

		} else if (h1 == h2) {
			if (m2 > m1) {
				int a = h2 * 3600 + m2 * 60 + s2;

				int b = h1 * 3600 + m1 * 60 + s1;

				int t = a - b;

				x = t / 3600;

				y = (t % 3600) / 60;

				z = t % 60;
			} else if (m1 == m2) {
				if (s2 > s1) {
					int a = h2 * 3600 + m2 * 60 + s2;

					int b = h1 * 3600 + m1 * 60 + s1;

					int t = a - b;

					x = t / 3600;

					y = (t % 3600) / 60;

					z = t % 60;
				} else {
					int a = (h2 + 24) * 3600 + m2 * 60 + s2;

					int b = h1 * 3600 + m1 * 60 + s1;

					int t = a - b;

					x = t / 3600;

					y = (t % 3600) / 60;

					z = t % 60;
				}
			}
		} else {
			int a = (h2 + 24) * 3600 + m2 * 60 + s2;

			int b = h1 * 3600 + m1 * 60 + s1;

			int t = a - b;

			x = t / 3600;

			y = (t % 3600) / 60;

			z = t % 60;
		}
		
		String d = String.valueOf(x);
		String e = String.valueOf(y);
		String f = String.valueOf(z);
		
		if(x<10) {
			d = "0" + d;
		}
		
		if(y<10) {
			e = "0" + e;
		}
		
		if(z<10) {
			f = "0" + f;
		}
		
		System.out.println(d + ":" + e + ":" + f);
	}
}