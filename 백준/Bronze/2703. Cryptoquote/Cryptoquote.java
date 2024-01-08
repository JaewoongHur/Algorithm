import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=n;tc++) {
			String s = br.readLine();
			
			String x = br.readLine();
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					sb.append(' ');
					continue;
				}
				sb.append(x.charAt((s.charAt(i))-'A'));				
			}
			
			sb.append('\n');
		}
		System.out.println(sb);		
	}
}