import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();	
		
		if(a/10 == a%10) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		}
}