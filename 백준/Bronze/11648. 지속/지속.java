import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int ans = 0;
		
		while(true) {
			if(s.length() == 1) {
				break;
			}
			
			int a = 1;
			
			for(int i=0;i<s.length();i++) {
				a *= s.charAt(i)-'0';
			}
			
			s = String.valueOf(a);
			ans++;
		}
		
		System.out.println(ans);
	}
}