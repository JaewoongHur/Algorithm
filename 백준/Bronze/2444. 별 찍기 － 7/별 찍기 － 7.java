import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2 * N - 1; j++) {
				if (j >= Math.abs(N - i - 1) && j <= Math.abs(N + i - 1)) {
					sb.append("*");
				} else if(j < Math.abs(N - i - 1)) {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		for (int i = N-2; i >=0; i--) {
			for (int j = 0; j < 2 * N - 1; j++) {
				if (j >= Math.abs(N - i - 1) && j <= Math.abs(N + i - 1)) {
					sb.append("*");
				} else if(j < Math.abs(N - i - 1)) {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		sc.close();
	}
}