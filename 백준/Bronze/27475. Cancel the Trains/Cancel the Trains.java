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
			int m = Integer.parseInt(st.nextToken());
			
			boolean[] bottom = new boolean[101];
			boolean[] left = new boolean[101];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<n;i++) {
				int a = Integer.parseInt(st.nextToken());
				bottom[a] = true;
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<m;i++) {
				int b = Integer.parseInt(st.nextToken());
				left[b] = true;
			}
			
			int ans = 0;
			
			for(int i=1;i<=100;i++) {
				if(bottom[i] && left[i]) {
					ans++;
				}
			}
			
			System.out.println(ans);
		}
	}
}