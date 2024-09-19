import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		for(int tc=0;tc<n;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int c = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			ans += Math.max(m*c, h*b);			
		}
		System.out.println(ans);
	}
}