import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int ans = 0;
			
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				
				int s = Integer.parseInt(st.nextToken());
				int f = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				if(a>f || b<s) {
					continue;
				}
				
				if(a>s) {
					s = a; 
				}
				
				if(b<f) {
					f = b;
				}
				
				ans += (f-s+1)*r;
			}
			
			System.out.println("Data Set " +tc +":");
			System.out.println(ans);	
			System.out.println();
		}
	}
}