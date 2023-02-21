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
		
		int[] A = new int[N+1];
		for(int i=1;i<=N;i++) {
			A[i] = i;			
		}
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = a + b;
			
			for(int j=a;j<=c/2;j++) {
				int tmp = A[j];
				A[j] = A[c-j];
				A[c-j] = tmp;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(A[i]+" ");
		}
		System.out.println(sb);
	}
}