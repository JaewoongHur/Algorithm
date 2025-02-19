import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb = new StringBuilder();
		
		int total = 999*39*5 + 333*5;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int fromNow = (y-1)*39*5 + (y-1)/3*5;
			
			if(y%3==0) {
				fromNow += (m-1)*20 + d;
			}else {
				fromNow += (m-1)*20 + d - (m-1)/2;
			}
			
			sb.append(total - fromNow + 1).append('\n');
		}
		System.out.println(sb);
	}
}