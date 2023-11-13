import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		
		int[] ca = new int[26];
		int[] cb = new int[26];
		
		for(int i=0;i<a.length();i++) {
			ca[a.charAt(i)-'a']++;
		}
		
		for(int i=0;i<b.length();i++) {
			cb[b.charAt(i)-'a']++;
		}
			
		int ans = 0;
		for(int i=0;i<26;i++) {
			ans+= Math.abs(ca[i]-cb[i]);
		}
		System.out.println(ans);
		
	}
}