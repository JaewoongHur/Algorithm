import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			int n = Integer.parseInt(s);
			
			st = new StringTokenizer(br.readLine());
			
			int idx = 0;
			int min = Integer.MAX_VALUE;
			
			for(int i=0;i<n;i++) {
				int a = Integer.parseInt(st.nextToken());
				
				if(Math.abs(2023-a) < min) {
					idx = i+1;
					min = Math.abs(2023-a);
				}
			}
			sb.append(idx).append('\n');
		}
		System.out.println(sb);
	}
}
