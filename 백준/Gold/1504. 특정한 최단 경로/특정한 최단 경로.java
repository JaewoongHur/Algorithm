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
	static int N, E;
	static ArrayList<Node>[] list;
	static int[] dist;
	static boolean[] visit;
	final static int INF = 500000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());

		dist = new int[N + 1];
		visit = new boolean[N+1];
		list = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			list[a].add(new Node(b, c));
			list[b].add(new Node(a, c));
		}

		st = new StringTokenizer(br.readLine());
		int v1 = Integer.parseInt(st.nextToken());
		int v2 = Integer.parseInt(st.nextToken());

		int rt1 = 0;

		rt1 += dijkstra(1, v1);
		rt1 += dijkstra(v1, v2);
		rt1 += dijkstra(v2, N);

		int rt2 = 0;

		rt2 += dijkstra(1, v2);
		rt2 += dijkstra(v2, v1);
		rt2 += dijkstra(v1, N);

		if (rt1 >= INF && rt2 >= INF) {
			System.out.println(-1);
		} else {
			int ans = Math.min(rt1, rt2);
			System.out.println(ans);
		}
	}

	static int dijkstra(int a, int b) {
		Arrays.fill(dist, INF);
		Arrays.fill(visit, false);

		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(a, 0));
		dist[a] = 0;

		while (!q.isEmpty()) {
			Node p = q.poll();
			int cur = p.end;

			if (!visit[cur]) {
				visit[cur] = true;
			}

			for (Node node : list[cur]) {
				if (visit[node.end])
					continue;
				if (dist[cur] + node.value < dist[node.end]) {
					dist[node.end] = dist[cur] + node.value;
					q.add(new Node(node.end, dist[node.end]));
				}
			}
		}
		return dist[b];
	}
}