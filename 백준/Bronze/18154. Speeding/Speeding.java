import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine().trim());
		st = new StringTokenizer(br.readLine());
		int t0 = Integer.parseInt(st.nextToken());
		int s0 = Integer.parseInt(st.nextToken());
		
		int max = 0;
		
		for(int i=0;i<n-1;i++) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			int v = (s-s0)/(t-t0);
			max = Math.max(max, v);
			
			t0 = t; s0 = s;
		}
		
		System.out.println(max);
	}
}