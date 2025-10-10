import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		int[] cipher = new int[n];
		
		for(int i=0;i<n;i++) {
			cipher[i] = s.charAt(i)-'a';
		}
		
		int[] plain = new int[n];
		
		plain[n-1] = br.readLine().charAt(0)-'a';
		
		for(int i=n-1;i>=1;i--) {
			plain[i-1] = (cipher[i] - plain[i] + 26) % 26;
		}
		
		for(int i=0;i<n;i++) {
			sb.append((char)(plain[i]+'a'));
		}
		System.out.println(sb);
	}
}