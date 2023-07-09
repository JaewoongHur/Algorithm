import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int k = sc.nextInt();
		
		if(7000*k<=x*1000) {
			System.out.println(7000*k);
		}
		else if(3500*k<=x*1000){
			System.out.println(3500*k);
		}
		else if(1750*k<=x*1000) {
			System.out.println(1750*k);
		}
		else {
			System.out.println(0);
		}
	}
}