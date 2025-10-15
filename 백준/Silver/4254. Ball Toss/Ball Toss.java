import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			boolean[] d = new boolean[n + 1];

			for (int i = 1; i <= n; i++) {
				String a = st.nextToken();

				if (a.equals("R")) {
					d[i] = true;
				}
			}

			boolean[] visit = new boolean[n + 1];
			visit[k] = true;

			int tossed = 1;

			int cnt = 1;

			int prev = 1;
			int now = k;

			while (true) {
				if (tossed == n) {
					break;
				}

				if (d[now]) {
					if ((prev % n) + 1 == now) {
						prev = now;
						now = (prev % n) + 1;
					} else {
						int tmp = now;
						now = (prev % n) + 1;
						prev = tmp;
					}
				} else {
					if ((prev - 2 + n) % n + 1 == now) {
						prev = now;
						now = prev - 1;
						if (now == 0)
							now = n;
					} else {
						int tmp = now;
						now = prev - 1;
						if (now == 0)
							now = n;
						prev = tmp;
					}
				}

				d[prev] = !d[prev];
				if (!visit[now]) {
					visit[now] = true;
					tossed++;
				}
				cnt++;

			}

			System.out.println("Classmate " + now + " got the ball last after " + cnt + " tosses.");
		}

	}
}