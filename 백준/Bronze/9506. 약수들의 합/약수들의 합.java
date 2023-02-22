import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s;
		while ((s = Integer.parseInt(br.readLine())) != -1) {
			int a = 1;
			int sum = 0;
			int last = 0;
			while (s / 2 >= a && sum <= s) {
				if (s % a == 0) {
					sum += a;
					last = a;
				}
				a++;
			}
			if (sum == s) {
				System.out.print(s + " = ");
				a = 1;
				int sum2= 0;
				while (s/2 >= a && sum2 <= s) {
					if (s % a == 0 && a != last) {
						sum2 += a;
						System.out.print(a + " + ");
					} else if (a == last) {
						System.out.println(a);
					}
					a++;
				}
			}
			else {
				System.out.println(s + " is NOT perfect.");
			}

		}

	}
}