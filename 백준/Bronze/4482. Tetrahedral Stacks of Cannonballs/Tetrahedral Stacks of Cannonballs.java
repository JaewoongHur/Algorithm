import java.util.Scanner;

public class Main {
	public static int DP(int x) {
		int s = 0;
		for (int i = 1; i <= x; i++) {
			s += i * (i + 1) / 2;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			System.out.println(i + ": " + a + " " + DP(a));
		}
		sc.close();
	}
}