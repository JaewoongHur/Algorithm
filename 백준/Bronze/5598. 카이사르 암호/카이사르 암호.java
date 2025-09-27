import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			sb.append((char)('A' + (23 + s.charAt(i)-'A')%26));
		}
		
		System.out.println(sb);
		
	}
}