import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int[] tmp = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				tmp[i] = Integer.parseInt(st.nextToken());				
			}
			
			int[][] arr = new int[N][N];
			for(int i=0;i<N;i++) {
				int sum = tmp[i];
				for(int j=i+1;j<N;j++) {
					sum += tmp[j];
					arr[i][j] = sum;
				}
			}
			
			int[][] dp = new int[N][N];
			
			for(int i=0;i<N-1;i++) {
				dp[i][i+1] = arr[i][i+1];
			}
			
			
			for(int i=2;i<N;i++) {
				for(int j=0;j<N-i;j++) { // arr[j][j+i]
					int min = Math.min(dp[j+1][j+i], dp[j][j+i-1]);
					for(int k=j+1;k<j+i;k++) {
						int s = dp[j][k] + dp[k+1][j+i];
						if(min>s) {
							min = s;
						}
					}
					dp[j][j+i] = min + arr[j][j+i];
				}			
			}
			
			System.out.println(dp[0][N-1]);
		}

	}
}