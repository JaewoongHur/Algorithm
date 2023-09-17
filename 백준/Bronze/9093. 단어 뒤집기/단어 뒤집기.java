import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				for(int j=0;j<s.length();j++) {
					sb.append(s.charAt(s.length()-j-1));					
				}
				sb.append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);		
	}
}