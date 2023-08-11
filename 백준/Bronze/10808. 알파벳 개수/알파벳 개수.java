import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alpha = new int[26];
		String s =br.readLine();
		for(int i=0;i<s.length();i++) {
			alpha[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(alpha[i]+" ");
		}	
		
	}
}