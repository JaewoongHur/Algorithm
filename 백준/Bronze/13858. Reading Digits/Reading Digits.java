import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] a = br.readLine().split(" ");

		int n = Integer.parseInt(a[0]);
		int p = Integer.parseInt(a[1]);

		String s = br.readLine();

		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			int b = 0;
			char c = ' ';
			for (int j = 0; j < s.length(); j++) {
				if (j % 2 == 0) {
					b = s.charAt(j) - '0';
					continue;
				}
				{
					c = s.charAt(j);
				}

				for (int k = 0; k < b; k++) {
					sb.append(c);
				}
			}
			s = sb.toString();
		}
		System.out.println(s.charAt(p));
	}
}
