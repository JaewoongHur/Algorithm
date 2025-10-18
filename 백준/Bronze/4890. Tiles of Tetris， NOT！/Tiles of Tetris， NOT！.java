import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0 0")) {
				break;
			}
			
			
			st = new StringTokenizer(s);
			
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			
			long g = gcd(a,b);
			
			System.out.println(a*b/g/g);
		}
	}
	
	static long gcd(long a, long b) {
		
		while(b!= 0) {
			long r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
	
}