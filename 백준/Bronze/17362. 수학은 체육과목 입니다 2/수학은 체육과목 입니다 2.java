import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a = n % 8;

		if (a > 5) {
			System.out.println(10 - a);
		} else if (a == 0) {
			System.out.println(2);
		} else {
			System.out.println(a);
		}
	}
}