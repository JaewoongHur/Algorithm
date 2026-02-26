import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] a = new int[n];
		int[] d = new int[m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), ":");
			int h = Integer.parseInt(st.nextToken());
			int min = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());

			a[i] = h * 3600 + min * 60 + s;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), ":");
			int h = Integer.parseInt(st.nextToken());
			int min = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());

			d[i] = h * 3600 + min * 60 + s;
		}

		int t = Integer.parseInt(br.readLine());

		int k = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (d[j] - a[i] >= t) {
					k = Math.min(k, d[j] - a[i]);
				}
			}
		}

		if (k == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(k);
		}

	}
}
