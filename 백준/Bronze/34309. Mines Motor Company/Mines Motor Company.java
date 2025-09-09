import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int dist = 0;
		
		String s = br.readLine();
		
		int x = s.charAt(0)-'A';
		int y = s.charAt(1)-'A';
		
		for(int i=0;i<n-1;i++) {
			String t = br.readLine();
			int a = t.charAt(0)-'A';
			int b = t.charAt(1)-'A';
			
			dist += Math.abs(x-a) + Math.abs(y-b);
			x = a; y = b;
		}
		System.out.println(dist);
	}
}