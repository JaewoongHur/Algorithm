import java.io.*;
import java.util.*;

public class Main {
	public static long dist(long[][] arr, int i, int j) {
		long dx = arr[i][0] - arr[j][0];
		long dy = arr[i][1] - arr[j][1];

		return dx * dx + dy * dy;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {

			long[][] arr = new long[4][2];

			for (int i = 0; i < 4; i++) {
				String[] s = br.readLine().split(" ");
				arr[i][0] = Long.parseLong(s[0]);
				arr[i][1] = Long.parseLong(s[1]);
			}

			long[] d = new long[6];
			int idx = 0;

			for (int i = 0; i < 4; i++) {
				for (int j = i + 1; j < 4; j++) {
					d[idx++] = dist(arr, i, j);
				}
			}

			Arrays.sort(d);

			if (d[0] > 0 && d[0] == d[1] && d[1] == d[2] && d[2] == d[3] && d[4] == d[5]) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
