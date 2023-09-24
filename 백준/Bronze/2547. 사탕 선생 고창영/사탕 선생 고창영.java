import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			br.readLine();
			BigInteger S = BigInteger.ZERO;
			
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				BigInteger a = BigInteger.valueOf(Long.parseLong(br.readLine()));
				S = S.add(a);
			}			
			if(S.remainder(BigInteger.valueOf(n))==BigInteger.ZERO) {
				sb.append("YES").append('\n');
			}
			else {
				sb.append("NO").append('\n');
			}
		}
		System.out.println(sb);
	}
}