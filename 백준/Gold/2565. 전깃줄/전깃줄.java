import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] wire = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			wire[i][0] = Integer.parseInt(st.nextToken());
			wire[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(wire, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		int[] dp = new int[n];
		dp[0] = 1;
		for(int i=0;i<n;i++) {
			int max = 1;
			for(int j=0;j<i;j++) {
				if(wire[i][1]>wire[j][1]) {
					max = Math.max(max, dp[j]+1);
				}
			}
			dp[i] = max;
		}
		
		Arrays.sort(dp);
		System.out.println(n - dp[n - 1]);
	}
}