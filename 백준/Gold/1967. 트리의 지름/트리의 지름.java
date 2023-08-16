import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Node {
	int end;
	int value;

	public Node(int end, int value) {
		this.end = end;
		this.value = value;
	}
}

public class Main {
	static int n, res;
	static ArrayList<Node>[] tree;
	static boolean[] visit,parent;
	static ArrayList<Integer> Leap = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		res = 0;
		tree = new ArrayList[n+1];
		parent = new boolean[n+1]; 
		visit = new boolean[n+1];
		for(int i=1;i<=n;i++) {
			tree[i] = new ArrayList<>();
		}

		for(int i=1;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			tree[a].add(new Node(b,c));
			tree[b].add(new Node(a,c));
			parent[a] = true;
		}
		
		
		for(int i=1;i<=n;i++) {
			if(!parent[i]) {
				Leap.add(i);
			}
		}
		
		for(int i=0;i<Leap.size();i++) {
			int k = Leap.get(i);
			dfs(k,0,k);
		}
		System.out.println(res);
		
	}
	
	static void dfs(int idx, int s,int start) {
		visit[idx]= true;
		res = Math.max(res, s);
		for(Node node: tree[idx]) {
			if(visit[node.end]) {
				continue;
			}
			dfs(node.end,s+node.value,start);
			visit[node.end]=false;
		}
		
	}

}