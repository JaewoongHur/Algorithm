import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		for (int i = M; i <= N; i++) {
			if (i == 1) {
				continue;
			} else if (i == 2) {
				System.out.println(2);
				continue;
			}
			int x = (int) Math.sqrt(i);
			while(!(i % x == 0) && x>1) {
				x--;
			}
			if(x == 1) {
				System.out.println(i);
			}
		}
	}
}
