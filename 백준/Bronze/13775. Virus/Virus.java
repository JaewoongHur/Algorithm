import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			char a = s.charAt(i);
			if(!Character.isAlphabetic(a)) {
				sb.append(a);
				continue;
			}
			sb.append((char)((26 + a-'a' - n)%26 + 'a'));
			
			n++;
			if(n > 25) {
				n = 1;
			}
		}
				
		System.out.println(sb);	
			
	}
}
