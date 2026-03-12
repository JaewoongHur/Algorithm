import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());

			String s = st.nextToken();
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());

			if (s.equals("AND")) {
				if (c >= 0 || b + c >= 0 || a + c >= 0 || a + b + c < 0) {
					System.out.println(false);
					continue;
				}
			} else {
				if (c >= 0 || b + c < 0 || a + c < 0 || a + b + c < 0) {
						System.out.println(false);
						continue;
					}
				}
				System.out.println(true);
			}
	}
}
