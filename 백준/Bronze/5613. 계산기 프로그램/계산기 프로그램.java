import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		int ans = Integer.parseInt(br.readLine());
		
		int t = 0;
		int a = 0;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("=")) {
				System.out.println(ans);
				break;
			}
			
			if(s.equals("+")) {
				t = 1;
			}else if(s.equals("-")) {
				t = 2;
			}else if(s.equals("*")) {
				t = 3;
			}else if(s.equals("/")) {
				t = 4;
			}else {
				a = Integer.parseInt(s);
				if(t==1) {
					ans += a;
				}else if(t==2) {
					ans -= a;
				}else if(t==3) {
					ans *= a;
				}else if(t==4) {
					ans /= a;
				}
			}
		}
	}
}