import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int S = sc.nextInt();
		sc.close();
		int res = 8*R + 3*S - 28;		
		System.out.println(res);
	}
}
