import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					arr[j + r][k + c] = 1;
				}
			}
		}

		int sum = 0;
		for (int j = 0; j < 100; j++) {
			for (int k = 0; k < 100; k++) {
				sum += arr[j][k];
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
