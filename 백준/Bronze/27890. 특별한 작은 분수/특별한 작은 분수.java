import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= t; i++) {
			if (h % 2 == 0) {
				h = (h / 2) ^ 6;
			} else {
				h = (2 * h) ^ 6;
			}
		}
		System.out.println(h);
	}
}