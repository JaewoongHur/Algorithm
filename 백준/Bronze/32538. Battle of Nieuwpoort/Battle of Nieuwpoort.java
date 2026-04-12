import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st.nextToken();
		st.nextToken();
		st.nextToken();
		
		boolean pass = false;
		
		int d = 0;
		String year = "";
		
		out: for(int i=2;i<=16;i++) {
			int a = n;
			StringBuilder sb = new StringBuilder();
			
			while(a>0) {
				if(a%i<10) {
					sb.append(a%i);
				}else {
					sb.append((char)((a%i-10)+'a'));
					
				}
				
				a/=i;
				
				if(sb.toString().length()==2 && !sb.toString().equals("00")) {
					continue out;
				}
			}
			if(sb.toString().length()>=3) {
				pass = true;
				d = i;
				year = sb.reverse().toString();	
			}
		}
		
		if(pass) {
			System.out.println(d + " " + year);
		}else {
			System.out.println("impossible");
		}
		
	}
}
