import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	int end;
	int value;
	
	Node(int end, int value){
		this.end = end;
		this.value = value;
	}
	@Override
	public int compareTo(Node o) {
		return this.value - o.value;
	}
}


public class Main {
	static int n, m, total;
	static ArrayList<Node>[] list;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		list = new ArrayList[n+1];
		visit = new boolean[n+1];
		for(int i=0;i<=n;i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			list[a].add(new Node(b,c));
			list[b].add(new Node(a,c));
		}
		
		PriorityQueue<Node> q = new PriorityQueue<>();
		total = 0;
		int max = 0;
		q.add(new Node(1,0));
		while(!q.isEmpty()) {
			Node p = q.poll();
			
			int e = p.end;
			int v = p.value;
			if(visit[e]) {
				continue;
			}
			visit[e] = true;
			max = Math.max(max, v);
			total += v;
			
			for(Node node : list[e]) {
				if(visit[node.end]) {
					continue;
				}
				q.add(node);
			}
		}
		
		System.out.println(total - max);		
	}
}