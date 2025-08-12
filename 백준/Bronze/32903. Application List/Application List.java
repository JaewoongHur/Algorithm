import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine().trim());

		boolean[] alpha = new boolean[26];
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			char c = s.charAt(0);
			
			if(alpha[c-'a']) continue;
			
			alpha[c-'a'] = true;
		}
	
		for(int i=0;i<5;i++) {
			for(int j=0;j<6;j++) {
				if(i*6+j > 25) break;
				if(alpha[i*6+j]) {
					System.out.print((char)('a'+i*6+j));
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}