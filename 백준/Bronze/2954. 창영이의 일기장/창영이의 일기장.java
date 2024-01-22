import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if(i+2<s.length()&& (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')){
				if(s.charAt(i+1)=='p'&&(s.charAt(i+2)=='a'||s.charAt(i+2)=='e'||s.charAt(i+2)=='i'||s.charAt(i+2)=='o'||s.charAt(i+2)=='u'))
					sb.append(s.charAt(i));
					i+=2;
					continue;
			}			
			sb.append(s.charAt(i));			
		}		
		System.out.println(sb.toString());
	}
}