import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		if(s.charAt(0)-'0' + s.charAt(4)-'0' == s.charAt(8)-'0') {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}