import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		long x = Long.parseLong(st.nextToken());
		long y = Long.parseLong(st.nextToken());

		long z = (y * 100) / x;

		if (z >= 99) {
			System.out.println(-1);
			return;
		}

		long left = 1;
		long right = 1000000000L;

		while (left <= right) {
			long mid = (left + right) / 2;

			long k = (y + mid) * 100 / (x + mid);

			if (k > z) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(left);
	}
}