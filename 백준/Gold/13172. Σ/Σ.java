import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	static final long X = 1000000007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int M = Integer.parseInt(br.readLine());
		
		long exp = 0;
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long r = gcd(a,b);
			
			a = a/r;
			b = b/r;			
			exp += ((fermat(a,X-2) * b) % X);
			exp %=X;
		}
		System.out.println(exp);
		
	}
	static long gcd(long a, long b) {
		long r = 1;
		
		while(r!=0) {
			r = b % a;
			b = a;
			a = r;
			
		}
		
		return b;		
	}
	static long fermat(long N, long index) {
		if(index == 1) {
			return N;
		}
		long tmp = fermat(N, index/2);
		if(index % 2 == 1) {
			return tmp*tmp % X * N % X;
		}
		else {
			return tmp*tmp % X;
		}
	}
	
}