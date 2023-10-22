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
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int date = Integer.parseInt(st.nextToken());
			
			int ans = 0;
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				int d = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				
				if(d>s*date) {
					continue;
				}
				ans+=v;
			}
			sb.append("Data Set ").append(tc).append(":").append('\n').append(ans).append('\n').append('\n');
		}
		System.out.println(sb);
	}
}