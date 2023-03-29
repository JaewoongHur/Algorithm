import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		int[] A = new int[N];
		int[] dp = new int[N];
		dp[0] = 1;
		
		int lenMax = 0;
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
			int max = 1;
			for(int j=0;j<i;j++) {
				if(A[i] > A[j]) {
					max = Math.max(max,dp[j]+1);
				}
			}
			dp[i] = max;
			lenMax = Math.max(lenMax, max);
		}
		System.out.println(lenMax);
	}
}