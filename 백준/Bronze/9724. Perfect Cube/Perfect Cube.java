import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= n; tc++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int c = (int) Math.ceil(Math.pow(a, 1.0d / 3.0d));
			int d = (int) Math.pow(b, 1.0d / 3.0d);

			System.out.println("Case #" + tc + ": " + (d - c + 1));
		}
	}
}