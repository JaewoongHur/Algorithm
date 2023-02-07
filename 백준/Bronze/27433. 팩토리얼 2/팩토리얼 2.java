import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a = 1;
		for(int i =1;i<=N;i++) {
			a *= i ;
		}
		if(N==0) {
			a = 1; 
		}
		System.out.println(a);
		sc.close();
	}
}