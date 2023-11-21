import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s = br.readLine()).equals("0")) {
			while (s.length() > 1) {
				int a = 0;

				for (int i = 0; i < s.length(); i++) {
					a += s.charAt(i) - '0';
				}
				
				s = String.valueOf(a);
			}
			System.out.println(s);
		}

	}
}