import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		BigInteger ans = factorial(N).divide((factorial(K).multiply(factorial(N-K))));
		System.out.println(ans.remainder(BigInteger.valueOf(10007)));
	}
	public static BigInteger factorial(int n) {
		if(n==0) {
			return BigInteger.valueOf(1);
		}
		BigInteger a = BigInteger.valueOf(1);
		for(int i=1;i<=n;i++) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		return a;
	}
	
}