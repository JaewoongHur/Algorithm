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
			s = br.readLine().trim();
			
			if(s.equals("0+0=0")) {
				System.out.println("True");
				break;
			}
			
			st = new StringTokenizer(s,"+");
			
			String x = st.nextToken();
			String t = st.nextToken();
			
			st = new StringTokenizer(t,"=");
			String y = st.nextToken();
			String z = st.nextToken();
			
			
			StringBuilder sb = new StringBuilder();
			sb.append(x);
			x = sb.reverse().toString();
			int a = Integer.parseInt(x);
			
			sb = new StringBuilder();
			sb.append(y);
			y = sb.reverse().toString();
			int b = Integer.parseInt(y);
			
			sb = new StringBuilder();
			sb.append(z);
			z = sb.reverse().toString();
			int c = Integer.parseInt(z);
			
			if(a + b == c) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}
	}
}