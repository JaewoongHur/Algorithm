import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int n = s.length();
		
		int sum = 0;
		
		for(int i=0;i<n/2;i++) {
			sum += s.charAt(i) - 'A';
		}
		
		int sum2 = 0;
		
		for(int i=n/2;i<n;i++) {
			sum2 += s.charAt(i) - 'A';
		}
		
		int[] arr = new int[n];
		
		for(int i=0;i<n/2;i++) {
			arr[i] = (s.charAt(i) - 'A' + sum)%26;
		}
		
		for(int i=n/2;i<n;i++) {
			arr[i] = (s.charAt(i) - 'A' + sum2)%26;
		}
		
		for(int i=0;i<n/2;i++) {
			arr[i] = (arr[i] + arr[n/2+i])%26;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n/2;i++) {
			sb.append((char)(arr[i] + 'A'));
		}
		
		System.out.println(sb);
	}
}
