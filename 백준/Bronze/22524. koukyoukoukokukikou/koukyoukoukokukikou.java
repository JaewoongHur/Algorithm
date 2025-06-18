import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] check = new boolean[26];
		check[7] = true;
		check[8] = true;
		check[9] = true;
		check[10] = true;
		check[11] = true;
		check[12] = true;
		check[13] = true;
		check[14] = true;
		check[15] = true;
		check[20] = true;
		check[24] = true;
		
		while(true) {
			String s = br.readLine();
			if(s.equals("#")) {
				break;
			}
			
			boolean a = check[s.charAt(0)-'a'];
		
			int cnt = 0;
			
			for(int i=1;i<s.length();i++) {
				if(a != check[s.charAt(i)-'a']) {
					a = !a;
					cnt++;				
				}
			}
			sb.append(cnt).append('\n');
		}
		
		System.out.println(sb);
		
	}
}