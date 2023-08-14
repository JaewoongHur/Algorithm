import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	int end;
	int len;
	
	Node(int end, int len){
		this.end = end;
		this.len = len;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.len-o.len;
	}
}

public class Main {
	static int n, m, r, max;
	static int[] dist, item;
	static boolean[] got; 
	static ArrayList<Node>[] list;
	static final int INF =Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		max = 0;
		item = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			item[i] = Integer.parseInt(st.nextToken());
		}
		dist= new int[n+1];
		list = new ArrayList[n+1];
		got = new boolean[n+1];
		for(int i=0;i<=n;i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0;i<r;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			list[a].add(new Node(b,c));
			list[b].add(new Node(a,c));
		}
		
		for(int i=1;i<=n;i++) {
			int sum = 0;
			Arrays.fill(got, false);
			for(int j=1;j<=n;j++) {
				if(i==j) {
					got[j] = true;
					continue;
				}
				dijkstra(i,j);				
			}
			for(int k=1;k<=n;k++) {
				if(got[k]) {
					sum+=item[k];
				}
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
	static void dijkstra(int x, int y) {
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(x,0));
		Arrays.fill(dist, INF);
		dist[x] = 0;
		while(!q.isEmpty()) {
			Node p = q.poll();
			
			int e = p.end;
			
			if(dist[y] <=m) {
				got[y] = true;
				return;
			}
			for(Node node: list[e]) {
				if(dist[node.end]>dist[e]+node.len) {
					dist[node.end] =  dist[e] +node.len;
					q.add(new Node(node.end,dist[node.end]));
				}
			}
			
		}
		
	}

}