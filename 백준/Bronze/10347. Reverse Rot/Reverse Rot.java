import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		
		char[] ROT13 = new char[28];
		
		for(int i=0;i<26;i++) {
			ROT13[i] = (char)('A' + i);
		}
		
		ROT13[26] = '_';
		ROT13[27] = '.';
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			String[] t = s.split(" ");
			
			int n = Integer.parseInt(t[0]);
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<t[1].length();i++) {
				if(Character.isAlphabetic(t[1].charAt(i))) {
					sb.append(ROT13[(t[1].charAt(i)-'A'+ n) % 28]);
				}else if(t[1].charAt(i)=='_') {
					sb.append(ROT13[(26 + n) % 28]);
				}else {
					sb.append(ROT13[(27 + n) % 28]);
				}
			}
			
			System.out.println(sb.reverse().toString());
		}
		
	}
}
