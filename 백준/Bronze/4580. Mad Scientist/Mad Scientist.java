import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			st = new StringTokenizer(s);
			
			int n = Integer.parseInt(st.nextToken());
			int prev = Integer.parseInt(st.nextToken());
			int k = 1;
			
			for(int i=0;i<prev;i++) {
				sb.append(k).append(' ');
			}
			k++;
			for(int i=1;i<n;i++) {
				int a = Integer.parseInt(st.nextToken());
				
				for(int j=0;j<a-prev;j++) {
					sb.append(k).append(' ');
				}
				k++;
				prev = a;
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}