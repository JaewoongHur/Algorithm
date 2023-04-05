import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N+1][N+1];
		int[][] S = new int[N+1][N+1];
		

		for(int i=1;i<=N;i++) {
			st= new StringTokenizer(br.readLine());
			int sum = 0;
			for(int j=1;j<=N;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
					sum+= arr[i][j];
					S[i][j] = sum+S[i-1][j];
			}
		}
		
		for(int i=0;i<M;i++) {
			st= new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
		
			int ans = S[x2][y2] - S[x2][y1-1] -S[x1-1][y2] +S[x1-1][y1-1];
			sb.append(ans).append("\n");	
		}
		System.out.println(sb);
	}
	
}