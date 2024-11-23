import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int a = 0 ;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='e') {
				a++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append('h');
		for(int i=0;i<2*a;i++) {
			sb.append('e');
		}
		sb.append('y');
		System.out.println(sb);
	}
}