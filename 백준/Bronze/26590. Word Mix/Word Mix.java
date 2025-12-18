import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		StringBuilder sb = new StringBuilder();
		
		if(a.length()>b.length()) {
			for(int i=0;i<b.length();i++) {
				if(i%2 == 0) {
					sb.append(a.charAt(i));
				}else {
					sb.append(b.charAt(i));
				}
			}
		}else{
			for(int i=0;i<a.length();i++) {
				if(i%2 == 0) {
					sb.append(a.charAt(i));
				}else {
					sb.append(b.charAt(i));
				}
			}
		}
			
		System.out.println(sb);
		
	}
}
