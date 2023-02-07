import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int S = sc.nextInt();
		
		if(S==1 | !(12<=T && T<=16)) {
			System.out.println(280);			
		}
		else {
			System.out.println(320);
		}
		sc.close();
	}
}