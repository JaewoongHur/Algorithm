import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int V, E, K;
	static ArrayList<Node>[] list;
	static final int INF = Integer.MAX_VALUE;
	static int[] dp;
	static boolean[] visit;

	static class Node implements Comparable<Node>{
		int end;
		int weight;
		
		public Node(int end, int weight) {
			this.end = end;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());

		K = Integer.parseInt(br.readLine());

		list = new ArrayList[V + 1];

		for (int i = 0; i <= V; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			list[u].add(new Node(v,w));
		}

		dp = new int[V + 1];
		Arrays.fill(dp, INF);

		visit = new boolean[V + 1];
		dijkstra();

		for (int i = 1; i <= V; i++) {
			if (dp[i] == INF) {
				sb.append("INF").append('\n');
			} else {
				sb.append(dp[i]).append('\n');
			}
		}
		System.out.println(sb);
	}

	private static void dijkstra() {
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(K,0));
		dp[K] = 0;

		while (!q.isEmpty()) {
			Node cur = q.poll();
			if(visit[cur.end]) continue;
			visit[cur.end] = true;
			
			for ( Node next : list[cur.end]) {
				if (dp[next.end] > next.weight + dp[cur.end]) {
					dp[next.end] = next.weight + dp[cur.end];
					q.add(new Node(next.end, dp[next.end]));
				}
			}

		}

	}
}