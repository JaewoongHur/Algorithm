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

	Node(int end, int value) {
		this.end = end;
		this.value = value;
	}

	@Override
	public int compareTo(Node o) {
		return this.value - o.value;
	}
}

public class Main {
	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] route = new int[N+1];
		ArrayList<Node>[] list = new ArrayList[N + 1];

		for (int i = 0; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			list[a].add(new Node(b, c));
		}

		st = new StringTokenizer(br.readLine());
		int startCity = Integer.parseInt(st.nextToken());
		int endCity = Integer.parseInt(st.nextToken());

		int[] dist = new int[N + 1];

		Arrays.fill(dist, INF);

		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(startCity, 0));
		dist[startCity] = 0;
		route[startCity] = 0;
		while (!q.isEmpty()) {
			Node p = q.poll();
			int e = p.end;
			
			if(e == endCity) {
				break;
			}
			for (Node node : list[e]) {
				if(node.value>dist[node.end]) {
					continue;
				}
				if (dist[node.end] > node.value + dist[e]) {
					dist[node.end] = node.value + dist[e];
					q.add(new Node(node.end, dist[node.end]));
					route[node.end] = e;
				}

			}
		}
		System.out.println(dist[endCity]);
		
		ArrayList<Integer> path = new ArrayList<>();
		int cur = endCity;
		
		while(cur !=0) {
			path.add(cur);
			cur = route[cur];
		}
		System.out.println(path.size());
		
		for(int i=path.size()-1;i>=0;i--) {
			System.out.print(path.get(i)+" ");
		}
		
		
	}
}