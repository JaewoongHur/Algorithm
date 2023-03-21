import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp(n-1)+" "+dp(n));
		}
		
	}
	static int dp (int n) {
		if(n==-1) {
			return 1;
		}
		else if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			int dp0 =0;
			int dp1 =1;
			int dp=0;
			for(int i=1;i<n;i++) {
				dp = dp1+dp0;
				dp0 = dp1;
				dp1 = dp;
			}
			return dp;
		}
	}
}