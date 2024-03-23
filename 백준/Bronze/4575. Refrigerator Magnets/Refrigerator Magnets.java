import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("END")) {
				break;
			}
			
			int[] alpha = new int[26];
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					continue;
				}
				
				alpha[s.charAt(i)-'A']++;
			}
			
			boolean pass = true;
			
			for(int i=0;i<26;i++) {
				if(alpha[i]>1) {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				sb.append(s).append('\n');
			}
			
		}
		System.out.println(sb);
	}
}