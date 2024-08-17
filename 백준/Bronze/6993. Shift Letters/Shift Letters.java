import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<n;tc++) {
			st = new StringTokenizer(br.readLine());
			
			String a = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			
			String c = a.substring(a.length()-b,a.length());
			c += a.substring(0,a.length()-b);
			
			System.out.println("Shifting " + a + " by " + b + " positions gives us: " + c);			
		}
	}
}