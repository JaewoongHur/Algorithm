import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int F = 1 ;
		while( N > 3*F*(F-1)+1 ) {
				F++;
		}
		System.out.println(F);
	}
}
