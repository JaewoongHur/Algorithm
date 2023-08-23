import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] inOrder, postOrder;
	static int idx;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());	
		idx = 0;
		inOrder = new int[n];
		postOrder = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			inOrder[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			postOrder[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0,n-1,0,n-1);
		System.out.println(sb);
	}
	static void dfs(int iS,int iE,int pS, int pE) {
		if(iS <= iE && pS <= pE) {
			int root = postOrder[pE];
			
			int tmp = iS;
			for(int i=iS; i<=iE;i++) {
				if(inOrder[i] == root) {
					tmp =i;
					break;
				}
			}
			sb.append(root).append(' ');
			dfs(iS,tmp-1,pS,pS+(tmp-1)-iS);
			dfs(tmp+1,iE,pE-iE+tmp,pE-1);
			
		}
	}
}