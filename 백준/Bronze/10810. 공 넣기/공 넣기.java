import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N+1];
		
		for(int a=0;a<M;a++) {
			st= new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());			
			
			for(int b=i; b<=j;b++) {
				A[b] = k;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int c=1;c<=N;c++) {
			sb.append(A[c]+" ");
		}		
		System.out.println(sb);
	}
}