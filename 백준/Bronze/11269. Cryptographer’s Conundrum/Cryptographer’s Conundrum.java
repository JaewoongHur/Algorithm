import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int ans = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i % 3 == 0 && s.charAt(i) != 'P') {
				ans++;
			} else if (i % 3 == 1 && s.charAt(i) != 'E') {
				ans++;
			} else if (i % 3 == 2 && s.charAt(i) != 'R') {
				ans++;
			}

		}
		System.out.println(ans);
	}
}