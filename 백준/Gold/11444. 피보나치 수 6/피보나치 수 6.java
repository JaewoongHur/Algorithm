import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long n, ans;
	static long[][] arr = {{1,1},{1,0}};
	final static int mod = 1000000007;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Long.parseLong(br.readLine());
		
		if(n==1) {
			ans = 1;
		}
		else if(n==2) {
			ans = 1;
		}
		else {
			long[][] result = fibonacci(arr,n-2);
			result = multiply(result, arr);
			ans = result[0][0] % mod;
		}
		
		System.out.println(ans);
		
	}
	
	private static long[][] multiply(long[][] result, long[][] arr2) {
		
		long[][] tmp = new long[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					tmp[i][j] += result[i][k] * arr2[k][j];
					tmp[i][j] %=mod;
				}
			}
		}
		
		return tmp;
	}

	private static long[][] fibonacci(long[][] A, long k){
		
		if(k == 1) {
			return A;
		}
		
		long[][] tmp = fibonacci(A,k/2);
		
		tmp = multiply(tmp,tmp);
		
		if(k % 2 == 1) {
			tmp = multiply(tmp,arr);
		}
		
		return tmp;
		
	}

}