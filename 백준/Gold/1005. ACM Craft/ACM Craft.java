import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int min =Integer.MAX_VALUE;
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			ArrayList<Integer>[] list = new ArrayList[N + 1];
			int[] degree = new int[N + 1];
			int[] D = new int[N + 1];
			int[] time = new int[N + 1];
			for (int i = 0; i <= N; i++) {
				list[i] = new ArrayList<>();
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				D[i] = Integer.parseInt(st.nextToken());
			}

			int a = 0;
			int b = 0;
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				list[a].add(b);
				degree[b]++;
			}
			int W = Integer.parseInt(br.readLine());

			Queue<int[]> q = new LinkedList<>();

			for (int i = 1; i <= N; i++) {
				if (degree[i] == 0) {
					q.add(new int[] {i,0});
				}
			}
			while (!q.isEmpty()) {
				int[] p = q.poll();
				int r = p[0];
				int t= p[1];
				if(r==W) {
					min = Math.min(min, t+D[W]);
				}
				
				for (int x : list[r]) {
					degree[x]--;
					time[x] = Math.max(t+D[r], time[x]);
					if (degree[x] == 0) {
						q.add(new int[] {x,time[x]});
					}
				}
			}
			sb.append(min+"\n");
		}		
		System.out.println(sb);
	}
}