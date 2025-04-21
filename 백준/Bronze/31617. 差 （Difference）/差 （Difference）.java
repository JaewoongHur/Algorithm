import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int k = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] B = new int[m];

		for (int i = 0; i < m; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(A[i] + k == B[j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}