import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		while (!(s = br.readLine()).equals("#")) {

			char c = s.charAt(0);
			char d = 'a';
			
			if (Character.isUpperCase(c)) {
				d = (char) (c + 32);
			} else {
				d = (char) (c - 32);
			}

			int cnt = 0;

			for (int i = 2; i < s.length(); i++) {

				if (s.charAt(i) == c || s.charAt(i) == d) {
					cnt++;
				}
			}
			System.out.println(c + " " + cnt);
		}

	}
}