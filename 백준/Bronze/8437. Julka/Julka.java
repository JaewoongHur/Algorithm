import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		sc.close();
		BigInteger n = (a.subtract(m)).divide(BigInteger.valueOf(2));
		BigInteger k = n.add(m);
		
		System.out.println(k);
		System.out.println(n);
		
	}
}
