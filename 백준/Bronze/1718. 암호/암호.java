import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		String key = br.readLine();
		
		int n = key.length();
		char[] a = s.toCharArray();
		char[] arr = key.toCharArray();		
		for(int i=0;i<s.length();i++) {
			if(a[i] == ' ') {
				sb.append(' ');
				continue;
			}
			int x = (a[i] - (arr[i%n]-'a'+1) -'a')%26;
			if(x<0) {
				x += 26;
			}
			sb.append((char)(x+'a'));
		}
		System.out.println(sb);
	}
}