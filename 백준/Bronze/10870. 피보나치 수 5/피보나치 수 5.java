import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int a1 = 1;
		int a2 = 0;
		int b = 0;
		if(n==1) b = 1;
 		if(n==2) b = 1;
		for(int i = 0; i<n-1;i++) {
				b = a1 + a2;
				a2 = a1;
				a1 = b;		
		}
		System.out.println(b);
	}
}
