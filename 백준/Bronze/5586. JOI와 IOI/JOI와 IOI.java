import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int a = 0; int b  =0;
		
		for (int i = 0; i < s.length()-2; i++) {
			if(s.charAt(i)=='J'&&s.charAt(i+1)=='O'&&s.charAt(i+2)=='I') {
				a++;
			}
			
			if(s.charAt(i)=='I'&&s.charAt(i+1)=='O'&&s.charAt(i+2)=='I') {
				b++;
			}
		}
		System.out.println(a);
		System.out.println(b);
	}
}