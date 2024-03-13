import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			s = br.readLine();
			if(s.equals("0")) {
				break;
			}
			
			while(true) {
				sb.append(s).append(' ');
				if(s.length()==1) {
					sb.append('\n');
					break;
				}
				
				int n = s.length();
				int a = 1;
				for(int i=0;i<n;i++) {
					a *= s.charAt(i)-'0';
				}
				
				s = String.valueOf(a);		
			}
			
		}
		System.out.println(sb);
	}
}