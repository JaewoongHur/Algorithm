import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sp = 0;
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		ArrayList<Node>[] list = new ArrayList[V+1];
		boolean[] visit = new boolean[V+1];
		for(int i=0;i<=V;i++) {
			list[i] = new ArrayList<>();
		}
		
		int a = 0; int b = 0; int c = 0;
		for(int i=0;i<E;i++) {
			st = new StringTokenizer(br.readLine());
			a= Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			list[a].add(new Node(b,c));
			list[b].add(new Node(a,c));
		}
		
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(1,0));
		while(!q.isEmpty()) {
			Node p = q.poll();
			int e = p.end;
			int val = p.value;
			
			if(visit[e]) {
				continue;
			}
			visit[e] = true;
			sp += val;
			
			for(Node node : list[e]) {
				if(!visit[node.end]) {
					q.add(new Node(node.end, node.value));
				}
			}
		}
		System.out.println(sp);
    }
}