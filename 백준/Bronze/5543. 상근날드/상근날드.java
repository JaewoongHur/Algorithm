import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int[] b = new int[] { b1, b2, b3 };
		int[] d = new int[] { d1, d2 };
		int min = b1 + b2 + b3 + d1 + d2;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (min > b[i] + d[j]) {
					min = b[i] + d[j];
				}
			}
		}
		System.out.println(min-50);
	}
}
