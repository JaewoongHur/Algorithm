import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] s = new String[k];
		
		for (int i = 0; i < k; i++) {
			s[i] = br.readLine();
		}
		
		int[] arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
		
		for(int i=0;i<k;i++) {
			int a = 0;
			
			st = new StringTokenizer(s[i]);
			int x = Integer.parseInt(st.nextToken());
			for(int j=0;j<x;j++) {
				int b = Integer.parseInt(st.nextToken());
				
				a += arr[b];
			}
			
			if(a % m == 0) {
				ans += a/m;
			}else {
				ans += a/m + 1;
			}
			
		}
		
		System.out.println(ans);
	}
}