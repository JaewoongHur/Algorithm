import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			double sum = 0;
			for (int j = 0; j < 10; j++) {
				int a = sc.nextInt();
				sum += a;
			}
			int b = (int) Math.round(sum / 10);
			System.out.println("#" + i + " " + b);
		}
		sc.close();
	}
}