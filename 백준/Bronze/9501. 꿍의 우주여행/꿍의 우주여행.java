import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<T;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int d = Integer.parseInt(st.nextToken());
			
			int ans = 0;
			
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				
				double a = Double.parseDouble(st.nextToken());
				double b = Double.parseDouble(st.nextToken());
				double c = Double.parseDouble(st.nextToken());
				
				if(a*b/c >= d) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}