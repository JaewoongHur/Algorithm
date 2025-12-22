import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigInteger a = new BigInteger(br.readLine());
		
		if(a.compareTo(BigInteger.valueOf(1)) != 0) {
			System.out.println(a.subtract(BigInteger.ONE).multiply(BigInteger.valueOf(2)));
		}else {
			System.out.println(1);
		}
	}
}
