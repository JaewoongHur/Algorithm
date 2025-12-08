import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int c = b/a;
			
			if(min > c) {
				min = c;
			}
			
		}
		
		System.out.println(min);
		
	}
}
