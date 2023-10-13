import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] alpha = new int[26];

		String s = "";
		int max = 0;
		while ((s = br.readLine()) != null) {
			sb.append(s);
		}
		s = sb.toString();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			}
			alpha[s.charAt(i) - 'a']++;
			if (max < alpha[s.charAt(i) - 'a']) {
				max = alpha[s.charAt(i) - 'a'];
			}
		}

		for (int i = 0; i < 26; i++) {
			if (max == alpha[i]) {
				System.out.print((char) (i + 'a'));
			}
		}
	}
}