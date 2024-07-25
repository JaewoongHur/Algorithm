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
		
		BigInteger a = new BigInteger(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		BigInteger k = BigInteger.ONE;
		
		for(int i=0;i<b;i++) {
			k = k.multiply(a);
		}
		
		String s = k.toString();
		
		StringBuilder sb = new StringBuilder();
		
		int n = s.length();
		int m = n / 70;
		
		for(int i=0;i<m;i++) {
			sb.append(s.substring(70*i,70*(i+1))).append('\n');
		}
		
		sb.append(s.substring(70*m,n));
		System.out.println(sb);
	}
}