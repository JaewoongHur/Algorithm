import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextInt();
		double n2 = sc.nextInt();
		double n12 = sc.nextInt();
		sc.close();
		System.out.println((int)(Math.floor((n1+1)*(n2+1)/(n12+1) - 1)));
	}
}
