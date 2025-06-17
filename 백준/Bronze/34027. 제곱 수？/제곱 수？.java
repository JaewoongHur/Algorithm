import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < t; tc++) {
			double a = Double.parseDouble(br.readLine());
			int b = (int) Math.sqrt(a);

			if (b * b == (int) a) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}