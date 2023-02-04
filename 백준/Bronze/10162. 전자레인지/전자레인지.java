import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.close();
		
		int A = T/300;
		T = T - 300*A;
		int B = T/60;
		T = T - 60*B;
		int C = T/10;
		
		if(T%10 !=0 ) {
			System.out.println(-1);
		}
		else {
			System.out.print(A+" "+B+" "+C);
		}
			
	}
}
