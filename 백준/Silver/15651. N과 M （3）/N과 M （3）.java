import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static int M;
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		N = Integer.parseInt(s.split(" ")[0]);
		M = Integer.parseInt(s.split(" ")[1]);
		arr = new int[M];
		dfs(0);
		System.out.println(sb);		
	}
	
	public static void dfs(int depth) {
		if(depth == M) {
			for(int x : arr) {
			sb.append(x+" ");
			}
			sb.append("\n");
			return;
			}	
				
		for(int i = 1 ;i<=N;i++) {
			arr[depth] = i;
			dfs(depth+1);
			
		}
		
		
	}
	
}