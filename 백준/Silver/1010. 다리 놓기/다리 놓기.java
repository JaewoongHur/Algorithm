import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		sb.append(combination(M, N)).append("\n");
		}
		System.out.println(sb);
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
	

	public static BigInteger combination(int n, int k) {
		return factorial(n).divide((factorial(k).multiply(factorial(n-k))));
	}
}