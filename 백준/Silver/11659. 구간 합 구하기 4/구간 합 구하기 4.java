import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] S = new int[N+1];
		st = new StringTokenizer(br.readLine());
		S[0] = 0;
		for(int i=1;i<=N;i++) {
			int n = Integer.parseInt(st.nextToken());
			S[i] = S[i-1]+n;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			st= new StringTokenizer(br.readLine());
			int a =  Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = S[b] - S[a-1];
			sb.append(sum).append("\n");
		}
		System.out.println(sb);		
	}
}