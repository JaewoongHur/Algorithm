import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s = s.substring(4, s.length()) + s.substring(0, 4);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				sb.append(s.charAt(i) - 'A' + 10);
			} else {
				sb.append(s.charAt(i));
			}
		}

		String ns = sb.toString();

		while (ns.length() > 9) {
			int a = Integer.parseInt(ns.substring(0, 3)) % 97;

			StringBuilder n = new StringBuilder();

			n.append(a).append(ns.substring(3, ns.length()));
			
			ns = n.toString();
		}

		if (Integer.parseInt(ns) % 97 == 1) {
			System.out.println("correct");
		}else {
			System.out.println("incorrect");
		}
	}
}