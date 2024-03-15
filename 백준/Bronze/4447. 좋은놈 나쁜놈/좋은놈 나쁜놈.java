import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<n;tc++) {
			s = br.readLine();
			
			String t = s.toLowerCase();
			
			int g = 0;
			int b = 0;
			
			for(int i=0;i<t.length();i++) {
				if(t.charAt(i)=='g') {
					g++;
				}
				if(t.charAt(i)=='b') {
					b++;
				}				
			}
			
			if(g>b) {
				sb.append(s).append(" is GOOD").append('\n');
			}else if(g<b) {
				sb.append(s).append(" is A BADDY").append('\n');
			}else {
				sb.append(s).append(" is NEUTRAL").append('\n');
			}
			
		}
		System.out.println(sb);
	}
}