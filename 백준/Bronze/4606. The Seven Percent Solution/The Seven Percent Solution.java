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

			if (s.equals("#")) {
				break;
			}

			int n = s.length();

			for (int i = 0; i < n; i++) {

				char a = s.charAt(i);

				if (a == ' ') {
					sb.append("%20");
				} else if (a == '!') {
					sb.append("%21");
				} else if (a == '$') {
					sb.append("%24");
				} else if (a == '%') {
					sb.append("%25");
				} else if (a == '(') {
					sb.append("%28");
				} else if (a == ')') {
					sb.append("%29");
				} else if (a == '*') {
					sb.append("%2a");
				} else {
					sb.append(a);
				}

			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}