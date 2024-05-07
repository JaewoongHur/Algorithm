import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			int n = s.length();
			
			double a = 0;
			
			for (int i = 0; i < n; i++) {
				a += (s.charAt(n-1-i)-'0')* (Math.pow(2, i+1) -1);
			}
			
			System.out.println((int)a);
		}

	}
}