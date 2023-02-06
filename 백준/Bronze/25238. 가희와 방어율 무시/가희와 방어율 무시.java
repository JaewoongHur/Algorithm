import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		if(a*((100-b)/100)>=100) {        //부동 소수점 체크
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	}
}
