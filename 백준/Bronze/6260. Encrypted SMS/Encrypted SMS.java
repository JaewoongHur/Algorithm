import java.io.*;
import java.util.*;

public class Main {
	static final String[] groups = {
	        "ABC", "DEF", "GHI", "JKL",
	        "MNO", "PQRS", "TUV", "WXYZ"
	    };
	
	static char decrypt(char c, int idx) {
		char upper = Character.toUpperCase(c);
		
		for(String g: groups) {
			int pos = g.indexOf(upper);
			
			if(pos != -1) {
				int len = g.length();
				int originalPos = ((pos - (idx%len) + len))%len;
				char result = g.charAt(originalPos);
				
				if(Character.isLowerCase(c)) {
					result = Character.toLowerCase(result);
				}
				return result;
			}
		}
		return c;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();
		
		while(!(s = br.readLine()).equals("#")) {
			for(int i=0;i<s.length();i++) {
				sb.append(decrypt(s.charAt(i), i+1));
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
