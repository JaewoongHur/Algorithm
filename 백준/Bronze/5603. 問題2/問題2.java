import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String s = br.readLine();

		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();

			char a = s.charAt(0);

			int m = s.length();
			
			if (m == 1) {
				sb.append(1).append(a);
				s = sb.toString();
				continue;
			}

			int c = 1;

			for (int j = 0; j < m - 1; j++) {
				if (a == s.charAt(j + 1)) {
					c++;
				} else {
					sb.append(c).append(a);
					a = s.charAt(j + 1);
					c = 1;
				}
			}
			sb.append(c).append(a);

			s = sb.toString();
		}
		System.out.println(s);
	}
}