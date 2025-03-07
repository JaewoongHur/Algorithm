import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int ans = n * n - (n * ((2 * a - 1) + (2 * b - 1)) - (2 * a - 1) * (2 * b - 1)) - 1;

		if (ans >= 0) {
			System.out.println(ans);
		} else {
			System.out.println(0);
		}
	}
}