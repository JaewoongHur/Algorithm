import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int[] low = new int[26];
		int[] up = new int[26];
		
		for(int tc=0;tc<T;tc++) {
			String s = br.readLine();
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ')continue;
				
				if(Character.isLowerCase(s.charAt(i))) {
					low[s.charAt(i)-'a']++;
				}else {
					up[s.charAt(i)-'A']++;
				}
			}			
		}
		
		for(int i=0;i<26;i++) {
			if(low[i] == 0) continue;
			
			sb.append((char)('a'+i)).append(' ').append(low[i]).append('\n');
		}
		
		for(int i=0;i<26;i++) {
			if(up[i] == 0) continue;
			
			sb.append((char)('A'+i)).append(' ').append(up[i]).append('\n');
		}
		
		System.out.println(sb);
		
	}
}
