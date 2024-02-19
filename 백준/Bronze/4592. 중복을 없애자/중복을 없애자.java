import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		StringBuilder sb = new StringBuilder();
		
		String s;
		
		while(!(s=br.readLine()).equals("0")) {
			st = new StringTokenizer(s);
			
			int a = Integer.parseInt(st.nextToken());
			
			int b = 0;
			for(int i=0;i<a;i++) {
				int c = Integer.parseInt(st.nextToken());
				
				if( b == c) {
					continue;
				}
				
				b = c;
				
				sb.append(b).append(' ');
			}
			sb.append('$').append('\n');
		}
		System.out.println(sb.toString());
	}
}