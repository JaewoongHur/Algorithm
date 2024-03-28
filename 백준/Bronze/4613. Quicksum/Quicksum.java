import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			int k = 0;
			for(int i=1;i<=s.length();i++) {
				if(s.charAt(i-1)==' ')continue;
				k += (s.charAt(i-1)-'A'+1)*i;
			}
			sb.append(k).append('\n');
		}
		System.out.println(sb);
	}
}