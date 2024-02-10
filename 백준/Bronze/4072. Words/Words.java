import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while(!(s=br.readLine()).equals("#")) {
			st = new StringTokenizer(s, " ");
			StringBuilder sb = new StringBuilder();
			
			int n = st.countTokens();
			
			for(int i=0;i<n;i++) {
				StringBuilder sb2 = new StringBuilder();
				sb2.append(st.nextToken());
				
				sb.append(sb2.reverse().toString()).append(' ');				
			}
			System.out.println(sb);
		}
	}
}