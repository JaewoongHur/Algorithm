import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] dp = new int[n];
		
		dp[0] = arr[0];
		
		for(int i=1;i<n;i++) {
			int max = 0;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					max = Math.max(max, dp[j]);
				}				
			}
			dp[i] = max + arr[i];
		}	
		
		Arrays.sort(dp);
		System.out.println(dp[n-1]);		
	}	
}