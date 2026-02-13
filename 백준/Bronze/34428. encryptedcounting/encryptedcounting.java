import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		String a = s[0];
		String b = s[1];
		
		int cnt = 0;
		
		while(true) {
			if(a.equals(b)) {
				break;
			}
			
			StringBuilder sb  = new StringBuilder();
			
			int c = 1;
			char prev = a.charAt(0);
			char now = ' ';
			
			if(a.length() == 1) {
				a = "1" + Character.toString(prev);
				cnt++;
				continue;
			}
			
			for(int i=1;i<a.length();i++) {
				now = a.charAt(i);
				
				if(prev != now){
					sb.append(c).append(prev);
					c = 0;
					prev = now;
				}
				c++;
			}
			
			if(c == 0) {
				sb.append(1).append(prev);
			}else {
				sb.append(c).append(prev);
			}
			
			a = sb.toString();
			cnt++;
			
		}
		System.out.println(cnt);
	}
}
