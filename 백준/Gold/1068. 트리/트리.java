import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, cnt;
	static int[] parent,root;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		parent = new int[N];
		root = new int[N];
		visit = new boolean[N];
		cnt = 0;
		st = new StringTokenizer(br.readLine());
		int k = 0;
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			parent[i] = a;
			if (a == -1) {
				root[k] = i;
				k++;
			}
		}
		
		int removeNode = Integer.parseInt(br.readLine());
		remove(removeNode);
		
		for(int i=0;i<k;i++) {
			cntLeaf(root[i]);
		}
		System.out.println(cnt);
	}
	static void cntLeaf(int node) {
		boolean isLeaf = true;
		visit[node] = true;
		if(parent[node] != -2) {
			for(int i=0;i<N;i++) {
				if(parent[i]==node && !visit[i]) {
					cntLeaf(i);
					isLeaf=false;
				}
			}
			if(isLeaf) {
				cnt++;
			}
			
		}
		
	}
	
	static void remove(int node) {
		parent[node] = -2;
		
		for(int i=0;i<N;i++) {
			if(parent[i]== node) {
				remove(i);
			}
		}
		
	}
}