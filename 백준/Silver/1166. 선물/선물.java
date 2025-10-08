import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		double l = Double.parseDouble(st.nextToken());
		double w = Double.parseDouble(st.nextToken());
		double h = Double.parseDouble(st.nextToken());

		double lo = 0.0d;
		double hi = Math.min(l, Math.min(w, h)); 
		
		int loop = 0;
		
		while(hi-lo > Math.pow(10, -9)) {
			
			if(loop > 60) {
				break;
			}
			
			double mid = (lo + hi) / 2;
			
			if(check(n,l,w,h,mid)) {
				lo = mid;
			}else {
				hi = mid;
			}
			loop++;
		}
		
		System.out.printf("%.10f", hi);
	
	}
	
	static boolean check(int n, double l, double w, double h, double mid) {
		
		long a1 = (long) (l/mid);
		long a2 = (long) (w/mid);
		long a3 = (long) (h/mid);
		
		if(a1 == 0 || a2 == 0 || a3 == 0) return false;
		
		long x = a1;
		
		if(x >= n) return true;
		
		if(a2 > n / x) return true;
		
		x *= a2;
		
		if(x >= n) return true;
		
		if(a3 > n / x) return true;

		x *= a3;
		
		return x >= n ;
	}
}