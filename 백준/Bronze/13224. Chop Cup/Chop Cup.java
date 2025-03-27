import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int a = 1;
		int b = 0;
		int c = 0;

		int tmp = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				tmp = b;
				b = a;
				a = tmp;
			} else if (s.charAt(i) == 'B') {
				tmp = c;
				c = b;
				b = tmp;
			} else {
				tmp = a;
				a = c;
				c = tmp;
			}
		}

		if (a == 1) {
			System.out.println(1);
		} else if (b == 1) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}

	}
}