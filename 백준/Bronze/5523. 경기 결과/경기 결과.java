import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int sa = 0;
		int sb = 0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a > b) {
				sa++;
			} else if (b > a) {
				sb++;
			}
		}
		System.out.println(sa + " " + sb);
	}
}