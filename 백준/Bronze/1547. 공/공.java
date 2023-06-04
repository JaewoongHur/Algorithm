import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] s;
		
		int pos = 1;
		
		for(int tc=1;tc<=T;tc++) {
			s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			if(a==pos) {
				pos = b;
			}
			else if(b==pos) {
				pos = a;
			}
			
		}
		System.out.println(pos);
	}
}