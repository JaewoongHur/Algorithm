import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if ((a + b) % 2 == 1 | (a<b)) {
			System.out.println(-1);
		} else {
			System.out.println((a + b) / 2 + " " + Math.abs((a - b) / 2));
		}
	}
}