import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int n = 1;
		while(X > n*(n+1)/2) {
			n++;		
			}
		int d = X - n*(n-1)/2;
		int a = n+1 - d ;
		if(n % 2 == 0) {
			System.out.println(d+"/"+a);
		}
		else {
			System.out.println(a+"/"+d);
		}
	}
}	
