import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int s = 91 + a+b*3+c;
		
		System.out.println("The 1-3-sum is "+s);
	}
}