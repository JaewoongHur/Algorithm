import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		String[] s = new String[n];
		
		int lmax = 0;
		
		for(int i=0;i<n;i++) {
			s[i] = br.readLine();
			lmax = Math.max(lmax, s[i].length());
		}
	
		for(int i=0;i<lmax;i++) {
			int[] check = new int[26];
			
			for(int j=0;j<n;j++) {
				if(s[j].length()<=i) continue;
				check[s[j].charAt(i)-'a']++;
			}
			
			int max = 0;
			
			for(int j=0;j<26;j++) {
				if(max < check[j]) {
					max = check[j];
				}
			}
			
			System.out.print((i+1) + ": ");
			for(int j=0;j<26;j++) {
				if(check[j] == max) {
					System.out.print((char)('a' + j) + " ");
				}
			}
			System.out.println();
		}
	}
}
