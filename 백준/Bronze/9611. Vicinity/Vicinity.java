import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] x = new int[n+1];
		int[] y = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			String[] s = br.readLine().split(" ");
			
			x[i] = Integer.parseInt(s[0]);
			y[i] = Integer.parseInt(s[1]);
		}
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=T;i++) {
			String[] s = br.readLine().split(" ");
			
			int m = Integer.parseInt(s[0]);
			int v = Integer.parseInt(s[1]);
			
			int ans = 0;
			
			for(int j=1;j<=n;j++) {
				if(j == m) continue;
				
				if((x[j]-x[m])*(x[j]-x[m]) + (y[j]-y[m])*(y[j]-y[m]) <= v*v) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}