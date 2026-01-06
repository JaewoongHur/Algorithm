import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		String s;
		
		int idx = 1;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			System.out.println("Machine " + idx);
			
			int n = Integer.parseInt(s);
			
			int[] level = new int[n+1];
			
			for(int i=1;i<=n;i++) {
				level[i] = Integer.parseInt(br.readLine());
			}
			
			String t;
			
			while(true) {
				t = br.readLine();
				
				if(t.equals("# 0")) {
					break;
				}
				
				st = new StringTokenizer(t);
				
				String a = st.nextToken();
				int b = Integer.parseInt(st.nextToken());
				
				int sum = 0;
				
				for(int i=0;i<b;i++) {
					st = new StringTokenizer(br.readLine());
					
					int l = Integer.parseInt(st.nextToken());
					int v = Integer.parseInt(st.nextToken());
					
					sum += level[l] * v;
				}
				
				System.out.println(a + " " + sum);
			}
			
			idx++;
		}
	}
}
