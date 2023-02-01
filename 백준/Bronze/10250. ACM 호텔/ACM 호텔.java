import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			double H = sc.nextInt();
			double W = sc.nextInt();
			int N = sc.nextInt();
		
			int X = (int)(Math.ceil(N/H));
			double Y = (int)(N % H);
			if(Y == 0) {
				Y = H;
			}
			if(Y<=H && X<=W)
			System.out.println((int)(100*Y+X));
		}
		sc.close();
	}
}