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
		int B = Integer.parseInt(st.nextToken());
		int[][] A = new int[N][M];
		
		int hmin = Integer.MAX_VALUE;
		int hmax = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				hmin = Math.min(hmin, A[i][j]);
				hmax = Math.max(hmax, A[i][j]);
			}
		}		
		
		int min = Integer.MAX_VALUE;
		int maxHeight = 0;
		int inventory = B;
		for (int i = hmax; i >= hmin; i--) {
			int w1 = 0;
			int w2 = 0;
			inventory = B;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (i > A[j][k]) {
							w2 += i - A[j][k];
						} 
					else if (i < A[j][k]) {
							w1 += A[j][k] - i;
						} 
					}
				}
			if(inventory+w1-w2<0 || inventory+w1-w2>64000000) {
				continue;
			}
			if (min > w1 * 2 + w2) {
				min = w1 * 2 + w2;
				maxHeight = i;	
			}	
		}
		System.out.println(min+" "+maxHeight);
	}
}