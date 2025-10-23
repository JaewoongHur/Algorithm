import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		String[] s = new String[n];
		
		for(int i=0;i<n;i++) {
			s[i] = br.readLine();
		}
		
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if(a.length() != b.length()) {
					return a.length()-b.length();
				}
				
				int sA = sum(a);
				int sB = sum(b);
				
				if(sA != sB) {
					return sA - sB;
				}
				
				return a.compareTo(b);				
			}
			
			private int sum(String s) {
				int sum = 0;
				for(char c: s.toCharArray()) {
					if(Character.isDigit(c)) {
						sum += c - '0';
					}
				}
				return sum;
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(String a : s) {
			sb.append(a).append('\n');
		}
		System.out.println(sb);
	}
}