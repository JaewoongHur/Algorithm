import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] check = new boolean[26];
		char[] arr = new char[26];
		
		String a = br.readLine();
		String b = br.readLine();
		
		int idx = 0;
		
		for(int i=0;i<a.length();i++) {
			if(check[a.charAt(i)-'A']) continue;
			check[a.charAt(i)-'A'] = true;
			arr[idx] = a.charAt(i);
			idx++;
		}
		
		for(int i=idx;i<26;i++) {
			for(int j=0;j<26;j++) {
				if(check[j]) continue;
				arr[i] = (char)(j + 'A'); 
				check[j] = true;
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<b.length();i++) {
			sb.append(arr[b.charAt(i)-'A']);
		}
		
		System.out.println(sb);
	}
}