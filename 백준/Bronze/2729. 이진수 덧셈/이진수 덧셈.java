import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());

			String a = st.nextToken();
			String b = st.nextToken();
			
			int x= 0; int y = 0;
			
			while(x<a.length()) {
				if(a.charAt(x)=='1') {
					break;
				}
				
				x++;
			}
			
			
			if(x == a.length()) {
				a = "0";
			}else {
				a = a.substring(x,a.length());
			}
			
			while(y<b.length()) {
				if(b.charAt(y)=='1') {
					break;
				}
				
				y++;
			}
			
			if(y == b.length()) {
				b = "0";
			}else {
				b = b.substring(y,b.length());
			}
			
			if(a.length()<b.length()) {
				String tmp = a;
				a = b;
				b = tmp;
			}
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(a.substring(0,a.length()-b.length()));
			
			for(int i=0;i<b.length();i++) {
				sb.append(a.charAt(i+a.length()-b.length())-'0' + b.charAt(i)-'0');				
			}
			String s = sb.toString();
			
			sb = new StringBuilder();
			
			int k = 0;
			
			for(int i=s.length()-1;i>=0;i--) {
				int c = s.charAt(i)-'0' + k ;
				
				if(c>=2) {
					k = 1;
					c -=2;
					sb.append(c);
				}else {
					k = 0;
					sb.append(c);
				}
			}
			
			if(k==1) {
				sb.append(1);
			}
			
			System.out.println(sb.reverse().toString());
		}
	}
}