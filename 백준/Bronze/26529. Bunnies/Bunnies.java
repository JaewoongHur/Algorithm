import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for(int i =0; i<n;i++) {
			a = sc.nextInt();
			System.out.println(fibo(a));
		}
		sc.close();
	}
	
	public static int fibo(int x) {
		if(x==0) return 1;		
		int c=1; int d=0;
		int e = 0;
		for(int i=0;i<x;i++) {
			e = c+d;
			d = c;
			c = e;
		}
		return e;
	}
	
}