import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int p = 0;
		int w = 0;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());			
			
			if(s.equals("A")) {
				p += (a/12)*(b/12)*(c/12);
				w += 1000;
			}else {
				w += 6000;
			}				
		}
		
		w += p * 500;
		
		System.out.println(w);
		System.out.println(p*4000);
		
	}
}
