import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		if (N == 1) {
		} else {
			int M = N;
			for (int i = 2; i <= N; i++) {
				while (M % i == 0) {
					M = M / i;
					System.out.println(i);
					if (M == 1) {
						break;
					}
				}
			}
		}
	}
}
