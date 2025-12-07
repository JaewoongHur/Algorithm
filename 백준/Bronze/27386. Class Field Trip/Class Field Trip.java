import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();
		
		char[] c = new char[a.length() + b.length()];
		
		for(int i=0;i<a.length();i++) {
			c[i] = a.charAt(i);			
		}
		
		for(int i=0;i<b.length();i++) {
			c[a.length() + i] = b.charAt(i);
		}
		
		Arrays.sort(c);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<c.length;i++) {
			sb.append(c[i]);
		}
		
		System.out.println(sb);
	}
}
