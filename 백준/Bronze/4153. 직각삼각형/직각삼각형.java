import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == 0) {
				break;
			}
			if (c < a && a < b) {
				int tmp = b;
				b = c;
				c = tmp;
			} else if (c < b && b < a) {
				int tmp = a;
				a = c;
				c = tmp;
			} else if (a < c && c < b) {
				int tmp = b;
				b = c;
				c = tmp;

			} else if (b < c && c < a) {
				int tmp = a;
				a = c;
				c = tmp;
			}

			if (a * a + b * b == c * c) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		sc.close();
	}
}