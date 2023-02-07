import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] a = new double[N];
		double b = 1;
		for (int i = 0; i < N; i++) {
			b = 1;
			for (int j = 0; j < 3; j++) {
				a[j] = sc.nextDouble();
				b *= a[j];
			}
			System.out.printf("$%.2f%n", b);
		}
		sc.close();
	}
}