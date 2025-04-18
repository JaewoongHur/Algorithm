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
		int m = Integer.parseInt(st.nextToken());
		
		int[] a = new int[n];
		int[] b = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i]<=b[j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}