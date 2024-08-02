import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");

		String a = s[0];
		String b = s[1];

		int n = b.length() - a.length();

		int min = Integer.MAX_VALUE;

		for (int i = 0; i <= n; i++) {
			int c = 0;
			for (int j = i; j < i + a.length(); j++) {
				if (a.charAt(j - i) == b.charAt(j))
					continue;
				c++;
			}
			min = Math.min(min, c);
		}
		System.out.println(min);
	}
}