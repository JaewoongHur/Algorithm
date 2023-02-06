import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static BigInteger fibo(int x) {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(0);
		if (x == 0)
			return BigInteger.valueOf(0);
		else if (x == 1)
			return BigInteger.valueOf(1);
		else {
			for(int i=1;i<x;i++) {
				c = b.add(a);
				BigInteger tmp = b;
				b = c;
				a = tmp;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (true) {
			n = sc.nextInt();
			if(n == -1) break;
			System.out.println("Hour "+n+": "+fibo(n)+" cow(s) affected");
		}
		sc.close();
	}
}
