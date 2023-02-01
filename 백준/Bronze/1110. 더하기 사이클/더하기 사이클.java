import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int c = N;
		int cycL = 0;
		while(true) {
		int a = c/10;
		int b = c%10;
		c = 10*b + (a+b)%10;
			cycL ++;
		if (N == c) break;	
		}
		System.out.println(cycL);
		sc.close();
	}
}