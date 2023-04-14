import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		int N = (int) (Math.log(B)/Math.log(2));
		
		long[] arr = new long[N+1];
		
		arr[0] = A;

		BigInteger k = BigInteger.ONE;
		
		for(int i=1;i<=N;i++) {
			k = BigInteger.valueOf(arr[i-1]).multiply(BigInteger.valueOf(arr[i-1])).remainder(BigInteger.valueOf(C));
			arr[i] = k.longValue();
		}	
	
		char[] s = Long.toBinaryString(B).toCharArray();
		
		BigInteger sum = BigInteger.ONE;
		for(int i=0;i<N+1;i++) {
			if(s[i] == '1') {
				sum = sum.multiply(BigInteger.valueOf(arr[N-i])).remainder(BigInteger.valueOf(C));
			}
		}
		System.out.println(sum);
	}
}