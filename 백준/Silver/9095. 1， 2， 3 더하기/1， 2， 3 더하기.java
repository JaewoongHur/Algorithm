import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=  new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		int[] dp = new int[11];
		
		
		int[] dp1 = new int[11]; // 1로 끝나는 조합
		int[] dp2 = new int[11]; // 2로 끝나는 조합
		int[] dp3 = new int[11]; // 3으로 끝나는 조합
		
		dp1[1] = 1;
		
		dp[1] = dp1[1];
		
		dp1[2] = 1;
		dp2[2] = 1;
		
		dp[2] = dp1[2] + dp2[2];
		
		dp1[3] = dp1[2] + dp2[2]; 
		dp2[3] = dp1[1];		
		dp3[3] = 1;
		
		dp[3] = dp1[3] + dp2[3] + dp3[3];
		
		dp1[4] = dp1[3] + dp2[3] + dp3[3];
		dp2[4] = dp1[2] + dp2[2];
		dp3[4] = dp1[1];
		
		dp[4] = dp1[4] + dp2[4] + dp3[4];
		
		for(int i=5;i<11;i++) {
			dp1[i] = dp1[i-1] + dp2[i-1] + dp3[i-1];
			dp2[i] = dp1[i-2] + dp2[i-2] + dp3[i-2];
			dp3[i] = dp1[i-3] + dp2[i-3] + dp3[i-3];
			
			dp[i] = dp1[i] + dp2[i] + dp3[i];
		}
		
		for(int tc=1 ; tc<=T; tc++) {
			
			int n = Integer.parseInt(br.readLine());
			
			sb.append(dp[n]).append('\n');
		}
		System.out.println(sb);
	}
}