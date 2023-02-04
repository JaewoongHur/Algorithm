import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double x = sc.nextInt();
		double y = sc.nextInt();
		double w = sc.nextInt();
		double h = sc.nextInt();
		sc.close();
		double dx = 0;
		double dy = 0;
		if(x>=w/2) {
			dx = w - x; 
		}
		else {
			dx = x ;
		}
		if(y>=(h/2)) {
			dy = h - y; 
		}
		else {
			dy = y ;
		}
		
		if(x == 0 | y == 0 | x == w | y == h) {
			dx = 0;
		}

		int min = (int)Math.min(dx, dy);
		System.out.println(min);
	}
}
