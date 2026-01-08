import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long k = Long.parseLong(st.nextToken());
		long t = Long.parseLong(st.nextToken());
		
		long sum = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			long a = Long.parseLong(st.nextToken());
			
			sum += (t/k)*(k/a) + (t%k)/a;
		}
		System.out.println(sum);
	}
}
