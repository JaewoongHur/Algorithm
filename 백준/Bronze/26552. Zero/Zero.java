import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			
			while(true) {
				a++;
				String s = String.valueOf(a);
				boolean pass = true;
				for(int j=0;j<s.length();j++) {
					if(s.charAt(j)=='0') {
						pass = false;
						break;
					}
				}
				
				if(pass) {
					break;
				}
			}
			
			System.out.println(a);
		}
		
	}
}
