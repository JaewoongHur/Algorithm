import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		
		while(true) {
			s = br.readLine();
			if(s.equals("*")) {
				break;
			}
			
			boolean[] arr = new boolean[26];
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					continue;
				}
				
				arr[s.charAt(i)-'a'] = true;
			}
			
			boolean pass = true;
			
			for(int i=0;i<26;i++) {
				if(!arr[i]) {
					pass = false;
				}
			}
			
			if(pass) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
		}
	}
}