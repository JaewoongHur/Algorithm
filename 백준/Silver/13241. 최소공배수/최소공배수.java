import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		long a = Long.parseLong(s.split(" ")[0]);
		long b = Long.parseLong(s.split(" ")[1]);
		long d = gcd(a,b);
		long lcm = a*b/d;
		System.out.println(lcm);
	}
	
	static long gcd(long a, long b) {
		while(b!=0) {
			long r = a%b;
			a= b;
			b= r;			
		}
		return a;
	}
}