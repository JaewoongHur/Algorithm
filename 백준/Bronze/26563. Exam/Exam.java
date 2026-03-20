import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < m; tc++) {
			int k = Integer.parseInt(br.readLine());

			int c = 0;

			String a = br.readLine();
			String b = br.readLine();

			int n = a.length();

			for (int i = 0; i < n; i++) {
				if (a.charAt(i)==b.charAt(i))
					c++;

			}

			if (c <= k) {
				System.out.println(c + n - k);
			} else {
				System.out.println(k + n - c);
			}

		}
	}
}
