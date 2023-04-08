import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int tc = 1;tc<=3;tc++) {
			int N = Integer.parseInt(br.readLine());
			
			BigInteger sum = BigInteger.ZERO;
			
			for(int i=0;i<N;i++) {
				String s = br.readLine();
				BigInteger n = new BigInteger(s);
				sum = sum.add(n);			
			}
			int result = sum.compareTo(BigInteger.ZERO); 
			if(result>0) {
				System.out.println("+");
			}
			else if(result<0) {
				System.out.println("-");
			}
			else {
				System.out.println(0);
			}
			
		}
		
		
	}
}