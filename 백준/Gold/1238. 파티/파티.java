import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	
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
	static int N, M, X;
	static final int INF = Integer.MAX_VALUE;
	static int[] dist;
	static ArrayList<Node>[] list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		dist = new int[N+1];
		for(int i=0;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			int c= Integer.parseInt(st.nextToken());
			
			list[a].add(new Node(b,c));
		}
		
		int max = 0;
		for(int i=1;i<=N;i++) {
			int x = dijkstra(i,X);
			x += dijkstra(X,i);
			if( x > max) {
				max = x;
			}
		}
		System.out.println(max);
	}	
	static int dijkstra(int s, int e) {
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(s,0));
		Arrays.fill(dist, INF);
		dist[s] = 0;
		while(!q.isEmpty()) {
			Node p = q.poll();
			int k = p.end;
			for(Node node: list[k]) {
				if(dist[node.end] > dist[k] + node.value) {
					dist[node.end] = dist[k] + node.value;
					q.add(new Node(node.end,dist[node.end]));
				}
			}
		}
		return dist[e];
	}
}