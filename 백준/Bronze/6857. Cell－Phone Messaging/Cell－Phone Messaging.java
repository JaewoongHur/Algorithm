import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] group = new char[] { 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7 };
		char[] press = new char[] { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4 };

		String s;

		while (!(s = br.readLine()).equals("halt")) {
			int prev = group[s.charAt(0) - 'a'];

			int time = press[s.charAt(0) - 'a'];

			for (int i = 1; i < s.length(); i++) {
				if (group[s.charAt(i) - 'a'] == prev) {
					time += 2;
				}

				time += press[s.charAt(i) - 'a'];
				prev = group[s.charAt(i) - 'a'];
			}
			
			System.out.println(time);
		}
	}
}
