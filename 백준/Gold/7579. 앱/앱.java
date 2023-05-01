import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] cost = new int[N];
		int[] memory = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			memory[i] = Integer.parseInt(st.nextToken());
		}
		
		st= new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
		
		int[][] dp = new int[N][10001];
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<N;i++) {
			int c = cost[i];
			int m = memory[i];
			
			for(int j=0;j<=10000;j++) {
				if(i==0) {
					if(j>=c) {
						dp[i][j] = m;
					}
				}
				else {
					if(j>=c) {
						dp[i][j] = Math.max(dp[i-1][j-c]+m, dp[i-1][j]);
					}
					else {
						dp[i][j] = dp[i-1][j];
					}
				}
				
				if(dp[i][j] >=M) {
					min = Math.min(min,j);
				}
			}
			
		}
		System.out.println(min);
	}

}