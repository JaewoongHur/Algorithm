import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int D, W, K, min;
	static int[][] A;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			D = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			A= new int[D][W];
			min = Integer.MAX_VALUE;
			for (int i = 0; i < D; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < W; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int n = 0; n <= D; n++) {
				if(dfs(A,0,0,n)) {
					min = Math.min(min, n);
					break;
				}				
			}
			sb.append("#"+tc+" ").append(min).append("\n");
		}
		System.out.println(sb);
	}
	static boolean dfs(int[][] A,int st,int depth, int n) {
		
		if(depth == n) {
			return pass(A);	
		}
		for(int i=st;i<D;i++) {
			int[][] B = new int[D][W];
			copy(A,B);
			changeA(B,i);
			if(dfs(B,i+1,depth+1,n)) {
				return true;			
			}
			changeB(B,i);
			if(dfs(B,i+1,depth+1,n)) {
				return true;
			}
		}
		return false;		
	}

	static boolean pass(int[][] A) {
		for (int i = 0; i < W; i++) {
			int cntA = 0;
			int cntB = 0;
			for (int j = 0; j < D; j++) {
				if (A[j][i] == 0) {
					cntA++;
					cntB = 0;
					if (cntA >= K) {
						break;
					}
				} else {
					cntB++;
					cntA = 0;
					if (cntB >= K) {
						break;
					}
				}
			}
			if (cntA < K && cntB < K) {
				return false;
			}
		}
		return true;
	}

	static void changeA(int[][] A, int r) {
		for (int i = 0; i < W; i++) {
			A[r][i] = 0;
		}
	}

	static void changeB(int[][] A, int r) {
		for (int i = 0; i < W; i++) {
			A[r][i] = 1;
		}
	}
	static void copy(int[][] A, int[][] B) {
		for(int i=0;i<D;i++) {
			for(int j=0;j<W;j++) {
				B[i][j] = A[i][j]; 
			}
		}
		
	}

}