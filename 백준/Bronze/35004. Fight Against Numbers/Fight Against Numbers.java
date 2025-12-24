import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		while(n != 0) {
			String s = Integer.toBinaryString(n);
			
			int a = 0;
			
			for(int i=0;i<s.length();i++) {
				a += Math.pow(2, i) * (s.charAt(i)-'0');
			}
			
			n = a - 1;
			
			ans++;
		}
		
		System.out.println(ans);
	}
}
