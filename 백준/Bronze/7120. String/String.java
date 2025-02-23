import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		char c = ' ';
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != c) {
				c = s.charAt(i);
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}