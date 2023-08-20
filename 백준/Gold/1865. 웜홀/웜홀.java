import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {

	int end;
	int value;

	public Node(int end, int value) {
		this.end = end;
		this.value = value;
	}

	@Override
	public int compareTo(Node o) {
		return this.value - o.value;
	} 

}

public class Main {
	static int N, M, W;
	static final int INF = Integer.MAX_VALUE;
	static int[] dist;
	static ArrayList<Node>[] list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());

			list = new ArrayList[N + 1];
			dist = new int[N + 1];
			for (int i = 0; i <= N; i++) {
				list[i] = new ArrayList<>();
			}

			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());

				list[a].add(new Node(b, c));
				list[b].add(new Node(a,c));
			}
			for(int i=0;i<W;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				list[a].add(new Node(b,-c));
			}
			
			boolean negativeCycle = false;
			for(int i=1;i<=N;i++) {
				if(bellmanFord(i)) {
					negativeCycle = true;
					sb.append("YES\n");
					break;
				}
			}
			if(!negativeCycle) {
				sb.append("NO\n");
			}
		}
		System.out.println(sb.toString());
	}

	static boolean bellmanFord(int s) {
		Arrays.fill(dist, INF);
		dist[s] = 0;
		boolean update =false;

		for(int i=0;i<N;i++) {
			update = false;
			for(int j=1;j<=N;j++) {
				for(Node node: list[j]) {
					if(dist[j]!=INF && dist[node.end] > dist[j]+node.value) {
						dist[node.end] = dist[j] +node.value;
						update = true;
					}
				}
			}
			if(!update) {
				break;
			}			
		}
		if(update) {
			for(int i=1;i<=N;i++) {
				for(Node node: list[i]) {
					if(dist[i] !=INF && dist[node.end]>dist[i]+node.value) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
}