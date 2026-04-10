import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		
		char[] x = a.toCharArray();
		int n = x.length;
		
		String b = br.readLine();
		
		int cnt = 0;
		int s = 0;
		for(int i=0;i<b.length();i++) {
			if(x[s] == b.charAt(i)) {
				s++;
				if(s == n) {
					cnt++;
					s = 0;
				}
			}	
		}
		
		System.out.println(cnt);
		
	}
}
