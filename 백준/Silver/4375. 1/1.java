import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		while (true) {
			s = br.readLine();

			if (s == null) {
				break;
			}

			BigInteger n = new BigInteger(s);

			BigInteger k = BigInteger.ONE;

			while (true) {

				if (k.remainder(n).compareTo(BigInteger.ZERO) == 0) {
					break;
				}
				
				k = k.multiply(BigInteger.valueOf(10)).add(BigInteger.ONE);
			}
			
			System.out.println(k.toString().length());
		}
	}
}