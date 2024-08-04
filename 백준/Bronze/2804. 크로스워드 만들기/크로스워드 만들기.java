import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		char c = ' ';
		
		int x = 0; int y = 0;
		
		out: for(int i=0;i<a.length();i++) {
			c = a.charAt(i);
			for(int j=0;j<b.length();j++) {
				if(c == b.charAt(j)) {
					x = j; y = i;
					break out;
				}				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0;i<b.length();i++) {
			for(int j=0;j<a.length();j++) {
				if(i != x) {
					if(j != y) {
					sb.append('.');
					}else {
						sb.append(b.charAt(i));
					}
				}else {
					sb.append(a.charAt(j));
				}
			}		
			sb.append('\n');
		}
		System.out.println(sb);
	}
}