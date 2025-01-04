import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int n = 0;

		while (true) {
			if (s.length() == 1) {
				int a = Integer.parseInt(s);
				
				System.out.println(n);
				
				if (a % 3 == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				break;
			}

			int k = 0;

			for (int i = 0; i < s.length(); i++) {
				k += s.charAt(i) - '0';
			}
			
			s = String.valueOf(k);

			n++;
		}
	}
}