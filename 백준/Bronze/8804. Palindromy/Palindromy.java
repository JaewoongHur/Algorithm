import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			boolean palindrome = true;
			
			for(int j=0;j<s.length()/2;j++) {
				if(s.charAt(j) != s.charAt(s.length()-j-1)) {
					palindrome = false;
					break;
				}
			}
			
			if(palindrome) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
		}
	}
}