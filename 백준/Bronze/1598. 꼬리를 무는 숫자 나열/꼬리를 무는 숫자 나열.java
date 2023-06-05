import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>=b) {
			int tmp = a;
			a= b;
			b= tmp;
		}
		
		int x = a % 4;
		int y = b % 4;
		
		if(x==0) {
			x= 4;
		}
		if(y==0) {
			y=4;
		}
		
		int h = Math.abs(x-y);
		
		a-=x;
		b-=y;
		int k = (b-a)/4;
		System.out.println(k+h);
	}
}