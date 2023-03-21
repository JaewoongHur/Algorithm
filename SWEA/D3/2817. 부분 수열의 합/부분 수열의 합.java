import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int[] A;
	static int N, K, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			A = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			cnt = 0;
			dfs(0, 0);
			sb.append("#" + tc + " ").append(cnt).append("\n");
		}
		System.out.println(sb);
	}

	static void dfs(int s, int f) {
		if (s == K) {
			cnt++;
			return;
		}
		if (s > K) {
			return;
		}
		for (int i = f; i < N; i++) {
			dfs(s+A[i], i + 1);					
		}
	}
}