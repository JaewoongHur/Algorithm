import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			String a = st.nextToken();
			String b = st.nextToken();
			
			if(a.equals("Y")) {
				h--;
				w++;
				sb.append("Y ");
			}else {
				if(w == 0) {
					h--;
					w++;
					sb.append("Y ");
				}else {
					sb.append("N ");
				}				
			}
			
			if(b.equals("Y")) {
				w--;
				h++;
				sb.append("Y\n");
			}else {
				if(h == 0) {
					w--;
					h++;
					sb.append("Y\n");
				}else {
					sb.append("N\n");
				}
			}
		}
		
		System.out.println(sb);
	
	}
}
