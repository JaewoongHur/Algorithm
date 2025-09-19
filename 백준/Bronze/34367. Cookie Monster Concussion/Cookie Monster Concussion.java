import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		int sum = 0;
		
		for(int i=0;i<s.length();i++) {
			sum += s.charAt(i)-'0';
		}
		
		while(sum >= 10) {
			String a = String.valueOf(sum);
			
			sum = 0;
			
			for(int i=0;i<a.length();i++) {
				sum += a.charAt(i)-'0';
			}
		}
		
		System.out.println(sum);
	}
}