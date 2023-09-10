import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int sum = 0;
			for (int j = 0; j < 10; j++) {
				int a = sc.nextInt();
				if (a % 2 == 1) {
					sum += a;
				}
			}
			System.out.println("#" + i + " " + sum);
		}
		sc.close();
	}
}