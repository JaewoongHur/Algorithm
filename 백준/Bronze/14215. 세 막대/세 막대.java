import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);

		if (a + b > c && b + c > a && c + a > b) {
			System.out.println(a + b + c);
		} else {
			if (a + b <= c) {
				System.out.println(2 * (a + b) - 1);
			} else if (b + c <= a) {
				System.out.println(2 * (b + c) - 1);
			} else {
				System.out.println(2 * (c + a) - 1);
			}
		}
	}
}