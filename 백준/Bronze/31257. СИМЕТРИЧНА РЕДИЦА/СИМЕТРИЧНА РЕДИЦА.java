import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String s = br.readLine();
		
		int idx = 0;
		for(int i=0;i<n;i++) {
			if(isPalindrome(s, i, n-1)){
				idx = i;
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(idx);
		
		if(idx != 0) {
		 sb.append(s.substring(0,idx));
		 System.out.println(sb.reverse().toString());
		}
	}
	
	static boolean isPalindrome(String s, int start, int end) {
		while(start < end) {
			if(s.charAt(start++) != s.charAt(end--)) return false;
		}
		return true;
	}
}