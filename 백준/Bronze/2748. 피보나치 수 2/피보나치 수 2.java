import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacci(n));
		sc.close();
	}
	
	
	public static long fibonacci(int x) {
		long a = 1;
		long b = 0;
		long c= 0;
		for(int i=0;i<x;i++) {
			c=b+a;
			a=b;
			b=c;
		}
		return c;
	}
}