import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				sb.append(s.charAt(i));
			}
		}
		
		String t = sb.toString();
		
		boolean isPalindrome = true;
		
		for(int i=0;i<t.length()/2;i++) {
			if(t.charAt(i) == t.charAt(t.length()-i-1)) {
				continue;
			}else {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
		
	}
}
