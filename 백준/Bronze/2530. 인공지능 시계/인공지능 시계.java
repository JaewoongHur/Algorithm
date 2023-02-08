import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int t = sc.nextInt();

		c += t;

		if (c > 59) {
			b += c / 60;
			c = c % 60;
		}
		if (b > 59) {
			a += b / 60;
			b = b % 60;
		}
		a = a % 24;

		System.out.println(a + " " + b + " " + c);
	}
}