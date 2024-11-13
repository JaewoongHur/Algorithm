import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s = br.readLine();
		
		int ans = 0;
		
		while (true) {
			String t = br.readLine();
			
			if(t == null) {
				break;
			}
			
			st = new StringTokenizer(t);

			int n = st.countTokens();
			
			for(int i=0;i<n;i++) {
				String a = st.nextToken();
				
				if(a.contains(s)) {
					ans++;
				}				
			}			

		}
		System.out.println(ans);
	}
}