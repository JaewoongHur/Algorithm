import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;

		while (true) {
			s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			int cnt = 0;
			
			for(int i=0;i<s.length()-1;i++) {
				if(s.charAt(i) == '1') {
					cnt++;
				}
			}
			
			if(s.charAt(s.length()-1) == 'e') {
				if(cnt % 2 == 0) {
					sb.append(s.substring(0,s.length()-1)).append('0').append('\n');
				}else {
					sb.append(s.substring(0,s.length()-1)).append('1').append('\n');
				}
			}else {
				if(cnt % 2 == 0) {
					sb.append(s.substring(0,s.length()-1)).append('1').append('\n');
				}else {
					sb.append(s.substring(0,s.length()-1)).append('0').append('\n');
				}
			}
		}
		System.out.println(sb);
	}
}