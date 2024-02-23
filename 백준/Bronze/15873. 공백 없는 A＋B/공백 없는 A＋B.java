import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		int a = 0;
		
		if (s.length() == 2) {
			a = s.charAt(0) - '0' + s.charAt(1) - '0';			
		} else if (s.length() == 3) {
			if(s.charAt(1) == '0') {
				a = 10 + s.charAt(2) - '0';
			} else if(s.charAt(2)=='0') {
				a = 10 + s.charAt(0) - '0';
			}
		} else if (s.length() == 4) {
			a = 20;
		}
		
		System.out.println(a);
	}
}