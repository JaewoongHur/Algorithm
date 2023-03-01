import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static char[] tree;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int tc=1;tc<=10;tc++) {
			int N = Integer.parseInt(br.readLine());			
			tree = new char[N+1];
			
			for(int i =1;i<=N;i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				tree[i] = st.nextToken().charAt(0);
			}
			sb.append("#").append(tc).append(' ');
			inorderTraversal(N, 1);
			sb.append("\n");
		}
		System.out.println(sb);
	}
	public static void inorderTraversal(int N, int k) {
		if(k>N) return;
		inorderTraversal(N, 2*k);
		sb.append(tree[k]);
		inorderTraversal(N, 2*k+1);
	}
	
}