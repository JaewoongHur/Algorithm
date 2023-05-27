import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		String s;
		
		for(int tc=1;tc<=T;tc++) {
			s= br.readLine();
			sb.append(s.charAt(0));
			for(int i=1;i<s.length();i++) {
				if(s.charAt(i-1)==s.charAt(i)) {
					continue;
				}
				else {
					sb.append(s.charAt(i));
				}
			}
			sb.append('\n');
		}
		System.out.println(sb); 
	
	}
}