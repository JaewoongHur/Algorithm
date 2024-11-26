import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		if (n == 1) {
			System.out.println("*");
		} else if (n == 2) {
			System.out.println(" *");
			System.out.println("***");
		} else {
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n + i; j++) {
					if (j == n - 1 - i || j == n - 1 + i) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				}
				System.out.println();
			}

			for (int i = 0; i < 2 * n - 1; i++) {
				System.out.printf("*");
			}
		}
	}
}