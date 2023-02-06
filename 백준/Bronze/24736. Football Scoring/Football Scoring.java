import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			int T = sc.nextInt();
			int F = sc.nextInt();
			int S = sc.nextInt();
			int P = sc.nextInt();
			int C = sc.nextInt();
			
			System.out.println(6*T+3*F+2*S+1*P+2*C);
		}
		sc.close();
	}
}
