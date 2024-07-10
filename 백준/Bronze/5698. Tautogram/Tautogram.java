import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("*")) {
				break;
			}
			
			st = new StringTokenizer(s);
			
			char a = Character.toUpperCase(s.charAt(0));
			
			int n = st.countTokens();
			
			boolean pass = true;
			
			for(int i=0;i<n;i++) {
				char t = Character.toUpperCase(st.nextToken().charAt(0));
				
				if(t != a) {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
		}
	}
}