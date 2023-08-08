import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String s;
		
		int[] a = new int[26];
		
		for(int i=0;i<N;i++) {
			s = br.readLine();
			a[s.charAt(0)-'a']++;
		}
		
		boolean predaja = true;
		for(int i=0;i<26;i++) {
			if(a[i]>=5) {
				sb.append((char)(i+'a'));
				predaja = false;
			}
		}
		if(predaja) {
			System.out.println("PREDAJA");
		}
		else {
			System.out.println(sb);
		}
		
	}
}