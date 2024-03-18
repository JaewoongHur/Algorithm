import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String[] s = new String[n+1];
		
		for(int i=1;i<=n;i++) {
			s[i] = br.readLine();
		}
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0;i<m;i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(a>=1 && a<=n) {
				sb.append("Rule ").append(a).append(": ").append(s[a]).append('\n');
			}else {
				sb.append("Rule ").append(a).append(": No such rule").append('\n');
			}
			
		}
		System.out.println(sb);
	}
}