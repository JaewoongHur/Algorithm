import java.util.*;
import java.io.*;

public class Solution {
	static int N, B, ans;
	static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer NB = new StringTokenizer(br.readLine());
			N = Integer.parseInt(NB.nextToken());
			B = Integer.parseInt(NB.nextToken());
			arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++)
				arr[i] = Integer.parseInt(st.nextToken());
		
			ans = Integer.MAX_VALUE;
			dfs(0, 0);
			sb.append("#"+t+" "+ans+"\n");
		}
		System.out.println(sb);
	}
	
	private static void dfs(int idx, int sum) {
		if (sum >= B) {
			ans = Math.min(ans, sum - B);
			return;
		}
		if (idx == N) return;
		dfs(idx+1, sum+arr[idx]);
		dfs(idx+1, sum);
	}
}