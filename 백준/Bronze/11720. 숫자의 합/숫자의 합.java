import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String x = sc.next();
		int sum = 0;
		for(int i=0; i<N; i++) {
			int n = x.charAt(i)-48;
			sum += n;
		}
		System.out.println(sum);
		sc.close();
	}
}
