import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s;
		

		while (true) {
			s = br.readLine();

			if (s.equals("#")) {
				break;
			}
			
			st = new StringTokenizer(s);
		
			int n = st.countTokens();
			
			int a = 0;
			int b = 0;
			
			for(int i=0;i<n;i++) {
				String t = st.nextToken();
				
				if(t.equals("*")) {
					break;
				}
				
				if(t.equals("A")) {
					a++;
				}else {
					int c = Integer.parseInt(t);
					
					if(c%2==0) {
						b++;
					}else {
						a++;
					}
				}
			}
			
			if(a>b) {
				sb.append("Cheryl").append('\n');
			}else if(a<b) {
				sb.append("Tania").append('\n');
			}else {
				sb.append("Draw").append('\n');
			}
			
		}

		System.out.println(sb);

	}
}