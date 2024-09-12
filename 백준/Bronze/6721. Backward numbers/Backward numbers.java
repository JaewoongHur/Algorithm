import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int tc=0;tc<T;tc++) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			
			StringBuilder a2 = new StringBuilder();
			a2.append(a);
			a2 = a2.reverse();
			
			StringBuilder b2 = new StringBuilder();
			b2.append(b);
			b2 = b2.reverse();
			
			int d = Integer.parseInt(a2.toString()) + Integer.parseInt(b2.toString());
			
			String c = String.valueOf(d);
			
			StringBuilder c2 = new StringBuilder();
			c2.append(c);
			c2 = c2.reverse();
			
			int ans = Integer.parseInt(c2.toString());
			
			System.out.println(ans);			
		}
	}
}