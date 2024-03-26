import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		while (true) {
			s = br.readLine();
			if (s.equals("#")) {
				break;
			}

			StringBuilder sb = new StringBuilder();

			boolean valid = true;
			for (int i = s.length() - 1; i >= 0; i--) {
				if (s.charAt(i) != 'b' && s.charAt(i) != 'd' && s.charAt(i) != 'p' && s.charAt(i) != 'q'
						&& s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'v' && s.charAt(i) != 'w'
						&& s.charAt(i) != 'x') {
					System.out.println("INVALID");
					valid = false;
					break;
				}

				switch (s.charAt(i)) {
				case 'b':
					sb.append('d');
					break;
				case 'd':
					sb.append('b');
					break;
				case 'p':
					sb.append('q');
					break;
				case 'q':
					sb.append('p');
					break;
				case 'i':
					sb.append('i');
					break;
				case 'o':
					sb.append('o');
					break;
				case 'v':
					sb.append('v');
					break;
				case 'w':
					sb.append('w');
					break;
				default:
					sb.append('x');
					break;
				}
			}
			if (valid) {
				System.out.println(sb);
			}
		}
	}
}