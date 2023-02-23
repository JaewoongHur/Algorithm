import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] arr = new int[N + M + 1];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= M; j++) {
					arr[i + j]++;
				}
			}
			int[] arr2 = Arrays.copyOf(arr, N + M + 1);
			Arrays.sort(arr2);
			int max = arr2[N + M];
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc);
			for (int i = 0; i < N + M + 1; i++) {
				if (arr[i] == max) {
					sb.append(" " + i);
				}
			}
			System.out.println(sb);
		}
	}
}