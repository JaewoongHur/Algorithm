import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			int n = Integer.parseInt(s);

			sb.append(n).append(" => ").append(n * n - n + 1).append('\n');

		}
		System.out.println(sb);
	}
}