import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[][] A;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		A = new int[N][N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				A[i][j] = Integer.parseInt(st.nextToken()) % 1000;
			}
		}
		
		int[][] ans = pow(A,B);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(ans[i][j]).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	private static int[][] pow(int[][] arr, long B) {
		if(B == 1) {
			return A;
		}
		
		int[][] par = pow(A, B/2);
		
		par = multiply(par,par);
		
		if(B % 2 == 1) {
			par = multiply(par,A);
		}
		return par;
	}
	
	private static int[][] multiply(int[][] A, int[][] X){
		
		int[][] arr = new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					
					arr[i][j] += A[i][k] * X[k][j];
					arr[i][j] %= 1000;
				}
				
			}
		}
		return arr;
		
	}
	
}