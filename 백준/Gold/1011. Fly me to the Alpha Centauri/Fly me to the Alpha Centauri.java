import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int len = y - x;
			
			int p = (int) Math.sqrt(len);
			
			int ans = 0;
			if(p*p == len) {
				ans = 2 *p-1;
			}
			
			if(len>p*p && len <= p*p+p) {
				ans = 2*p;
			}
			
			if(len> p*p+p) {
				ans = 2*p+1;
			}
			
			if(len == 1) {
				ans = 1;
			}
			else if(len==2) {
				ans = 2;
			}
			
			sb.append(ans).append('\n');
		}
		System.out.println(sb);
	}
}