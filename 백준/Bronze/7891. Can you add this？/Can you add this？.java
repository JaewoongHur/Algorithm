import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ;i<N;i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			sb.append(x+y).append("\n");
		}
		System.out.println(sb);
	}
}