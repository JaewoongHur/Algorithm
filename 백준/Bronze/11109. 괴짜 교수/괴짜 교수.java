import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			int d = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());

			int a = d + p * n;
			int b = s * n;

			if (a > b) {
				System.out.println("do not parallelize");
			} else if (a == b) {
				System.out.println("does not matter");
			} else {
				System.out.println("parallelize");
			}
		}
	}
}