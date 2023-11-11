import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		
		while(!(s=br.readLine()).equals("#")) {
			int k = 0;
			
			for(int i=0;i<s.length();i++) {
				int a = 0;
				switch(s.charAt(i)) {
				case '-':
					a=0;
					break;
				case '\\':
					a=1;
					break;
				case '(':
					a=2;
					break;
				case '@':
					a=3;
					break;
				case '?':
					a=4;
					break;
				case '>':
					a=5;
					break;
				case '&':
					a=6;
					break;
				case '%':
					a=7;
					break;
				case '/':
					a=-1;
					break;
				}
				
				k += a*(int)Math.pow(8,s.length()-i-1);
			}
			System.out.println(k);
		}
		

	}
}