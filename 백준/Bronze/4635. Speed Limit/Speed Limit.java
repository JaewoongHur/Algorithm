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
			if(s.equals("-1")) {
				break;
			}
			
			int n = Integer.parseInt(s);
			
			int t = 0;
			int prev = 0;
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				t += a * (b-prev);
				prev = b;
			}
			System.out.println(t + " miles");
		}
	}
}