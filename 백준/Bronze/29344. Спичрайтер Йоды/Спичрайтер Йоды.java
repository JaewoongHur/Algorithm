import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(),".");
		
		int n = st.countTokens();
		
		String[] sentence = new String[n];
		
		for(int i=0;i<n;i++) {
			sentence[i] = st.nextToken();
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(sentence[i]);
			
			int m = st.countTokens();
			
			String[] s = new String[m];
			
			for(int j=0;j<m;j++) {
				s[j] = st.nextToken();
			}
			
			for(int j=m-1;j>0;j--) {
				sb.append(s[j]).append(' ');
			}
			sb.append(s[0]).append(". ");
		}
		
		System.out.println(sb);
	}
}