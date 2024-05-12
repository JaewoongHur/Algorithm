import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int tc=0;tc<n;tc++) {
			String s = br.readLine();
			
			StringBuilder sb = new StringBuilder();
			
			int m = s.length();
			
			int prev = s.charAt(0)-'0';
			
			int cnt = 0;
			
			for(int i=0;i<m;i++) {
				if(prev == s.charAt(i)-'0') {
					++cnt;
				}else {
					sb.append(cnt).append(prev);
					cnt = 1; 
				}
				prev = s.charAt(i)-'0';
				
			}
			sb.append(cnt).append(prev);
			
			System.out.println(sb);
		}
	}
}