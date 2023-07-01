import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a==0) {
			System.out.println(1);
		}
		else if(a==1) {
			System.out.println(1);
		}
		else if(a==2) {
			System.out.println(2);
		}
		else if(a==3) {
			System.out.println(6);
		}
		else if(a==4) {
			System.out.println(4);
		}
		else {
			System.out.println(0);
		}
	}
}