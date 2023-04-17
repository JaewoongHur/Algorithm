import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		char[] str = br.readLine().toCharArray();
		boolean[] check = new boolean[str.length];
		
		for(int i=0;i<N-1;i++) {
			String s2 = br.readLine();
			
			for(int j=0;j<str.length;j++) {
				if(str[j]!=s2.charAt(j)) {
					check[j] = true;
				}
			}
			
		}
		
		for(int i=0;i<str.length;i++) {
			if(check[i]) {
				sb.append('?');
			}
			else {
				sb.append(str[i]);
			}
		}
		System.out.println(sb);
	}
}