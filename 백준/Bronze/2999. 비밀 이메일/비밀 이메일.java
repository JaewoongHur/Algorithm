import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int n = s.length();
		
		int r = 0;
		int c = 0;
		
		for(int i=1;i*i<=n;i++) {
			if(n%i == 0) {
				r = i;
			}			
		}
		
		c = n/r;
		
		char[][] code = new char[r][c];
		
		int idx = 0;
		
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				code[j][i] = s.charAt(idx);
				idx++;
			}
		}
	
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sb.append(code[i][j]);
			}
		}
		
		System.out.println(sb);
	}
}
