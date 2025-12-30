import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		int key = s.charAt(0) ^ 'C';

		for(int i=0;i<s.length();i++) {
			sb.append((char)(s.charAt(i)^key));
		}
		
		System.out.println(sb);
		
	}
}
