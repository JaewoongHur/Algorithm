import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			int[] arr = new int[m + 1];

			for (int i = 1; i <= m; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			int s = 0;

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());

				int h = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				int idx = Integer.parseInt(st.nextToken());
				s += h * w * d * arr[idx];
			}

			System.out.println("Data Set " + tc + ":");
			System.out.println(s);
		}

	}
}