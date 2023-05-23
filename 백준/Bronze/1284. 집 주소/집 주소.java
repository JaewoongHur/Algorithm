import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		
		while((s=br.readLine())!=null) {
			if(s.equals("0")) {
				break;
			}
			
			int n = s.length();
			
			int ans = 0;
			
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='1') {
					ans+= 2;
				}
				else if(s.charAt(i)=='0'){
					ans+= 4;
				}
				else {
					ans+=3;
				}
			}
			sb.append(ans+n+1).append('\n');
		}
		System.out.println(sb);
	}
}