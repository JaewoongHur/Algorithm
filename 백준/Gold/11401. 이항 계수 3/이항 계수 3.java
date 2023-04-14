import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		int p = 1000000007;
		
		BigInteger multi1 = BigInteger.ONE;
		if (k % 2 == 0) {
			for (int i = 0; i < k / 2; i++) {
				multi1 = multi1.multiply(BigInteger.valueOf(n-i)).multiply(BigInteger.valueOf(n-k+1+i)).remainder(BigInteger.valueOf(p));
			}
		} else {
			multi1 = multi1.multiply(BigInteger.valueOf((2*n-k+1)/2));
			for(int i=0;i<k/2;i++) {
				multi1 = multi1.multiply(BigInteger.valueOf(n-i)).multiply(BigInteger.valueOf(n-k+1+i)).remainder(BigInteger.valueOf(p));
			}
		}
		
		BigInteger rk = BigInteger.ONE;
		if (k % 2 == 0) {
			for (int i = 0; i < k / 2; i++) {
				rk = rk.multiply(BigInteger.valueOf(1+i)).multiply(BigInteger.valueOf(k-i)).remainder(BigInteger.valueOf(p));
			}
		} else {
			rk = rk.multiply(BigInteger.valueOf((k+1)/2)).remainder(BigInteger.valueOf(p));
			for(int i=0;i<k/2;i++) {
				rk = rk.multiply(BigInteger.valueOf(1+i)).multiply(BigInteger.valueOf(k-i)).remainder(BigInteger.valueOf(p));
			}
		}
		
		int m = (int)(Math.log(p-2)/Math.log(2));
		
		int[] arr = new int[m+1];
		
		arr[0] = rk.intValue();
		BigInteger sum = BigInteger.ONE;
		
		for(int i=1;i<=m;i++) {
			sum = BigInteger.valueOf(arr[i-1]).multiply(BigInteger.valueOf(arr[i-1])).remainder(BigInteger.valueOf(p));
			arr[i] = sum.intValue();
		}
		
		char[] c = Integer.toBinaryString(p-2).toCharArray();
	
		
		BigInteger multi2 = BigInteger.ONE;
		
		for(int i=0;i<=m;i++) {
			if(c[i] == '1') {			
				multi2 = multi2.multiply(BigInteger.valueOf(arr[m-i])).remainder(BigInteger.valueOf(p));
			}
		}
		
		BigInteger ans = multi1.multiply(multi2).remainder(BigInteger.valueOf(p));
		System.out.println(ans.intValue());
	}
}