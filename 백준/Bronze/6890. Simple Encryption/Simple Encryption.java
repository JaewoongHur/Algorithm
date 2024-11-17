import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String key = br.readLine();
		
		int n = key.length();
		
		int[] shift = new int[n];
		
		for(int i=0;i<n;i++) {
			shift[i] = key.charAt(i)-'A';	
		}
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		int k = 0;
		
		for(int i=0;i<s.length();i++) {
			if(!Character.isAlphabetic(s.charAt(i))) {
				continue;
			}
			
			int a = s.charAt(i)-'A';
			sb.append((char)((a+shift[k%n])%26 +'A'));
			k++;
		}
		
		System.out.println(sb);
	}
}