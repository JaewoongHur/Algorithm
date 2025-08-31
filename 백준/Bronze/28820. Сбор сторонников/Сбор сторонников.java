import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		long L = 1;
		
		for(int i=0;i<n;i++) {
			L = L*arr[i]/gcd(L,arr[i]);
		}
		
		long ans = (s+L)%7;
		if(ans == 0) ans = 7;
		
		System.out.println(ans);
	}
	
	static long gcd(long a, long b) {
		while(b!=0) {
			long r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}