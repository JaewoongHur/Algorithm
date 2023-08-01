import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	int end;
	int time;
	
	public Node(int end, int time) {
		this.end = end;
		this.time = time;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.time - o.time;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		boolean[] visit = new boolean[100001];
		
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(N,0));
		
		while(!q.isEmpty()) {
			Node p = q.poll();
			
			int e =  p.end;
			int t =  p.time;
			
			visit[e] = true;
			
			if(e==K) {
				System.out.println(t);
				break;
			}
			
			  if (2 * e <= 100000 && !visit[2 * e]) {
	                q.add(new Node(2 * e, t));
	            }
	            if (e + 1 <= 100000 && !visit[e + 1]) {
	                q.add(new Node(e + 1, t + 1));
	            }
	            if (e - 1 >= 0 && !visit[e - 1]) {
	                q.add(new Node(e - 1, t + 1));
	            }
			}
		}
	}