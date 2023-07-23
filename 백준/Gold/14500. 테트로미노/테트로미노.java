import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class Main {
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		int max = 0;

		int[][] arr = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][][] tet = new int[19][2][4];

		tet[0][0] = new int[] { 0, 0, 0, 0 };
		tet[0][1] = new int[] { 0, 1, 2, 3 };
		tet[1][0] = new int[] { 0, 1, 2, 3 };
		tet[1][1] = new int[] { 0, 0, 0, 0 };

		tet[2][0] = new int[] { 0, 0, 1, 1 };
		tet[2][1] = new int[] { 0, 1, 0, 1 };

		tet[3][0] = new int[] { 0, 1, 2, 2 };
		tet[3][1] = new int[] { 0, 0, 0, 1 };
		tet[4][0] = new int[] { 1, 1, 1, 0 };
		tet[4][1] = new int[] { 0, 1, 2, 2 };
		tet[5][0] = new int[] { 0, 0, 1, 2 };
		tet[5][1] = new int[] { 0, 1, 1, 1 };
		tet[6][0] = new int[] { 0, 1, 0, 0 };
		tet[6][1] = new int[] { 0, 0, 1, 2 };

		tet[7][0] = new int[] { 0, 1, 1, 2 };
		tet[7][1] = new int[] { 0, 0, 1, 1 };
		tet[8][0] = new int[] { 1, 1, 0, 0 };
		tet[8][1] = new int[] { 0, 1, 1, 2 };

		tet[9][0] = new int[] { 0, 0, 0, 1 };
		tet[9][1] = new int[] { 0, 1, 2, 1 };
		tet[10][0] = new int[] { 0, 1, 2, 1 };
		tet[10][1] = new int[] { 0, 0, 0, 1 };
		tet[11][0] = new int[] { 0, 1, 1, 1 };
		tet[11][1] = new int[] { 1, 0, 1, 2 };
		tet[12][0] = new int[] { 1, 0, 1, 2 };
		tet[12][1] = new int[] { 0, 1, 1, 1 };
		
		tet[13][0] = new int[] { 2, 0, 1, 2 };
		tet[13][1] = new int[] { 0, 1, 1, 1 };
		tet[14][0] = new int[] { 0, 1, 1, 1 };
		tet[14][1] = new int[] { 0, 0, 1, 2 };
		tet[15][0] = new int[] { 0, 0, 1, 2 };
		tet[15][1] = new int[] { 0, 1, 0, 0 };
		tet[16][0] = new int[] { 0, 0, 0, 1 };
		tet[16][1] = new int[] { 0, 1, 2, 2 };
		
		tet[17][0] = new int[] { 1, 2, 0, 1 };
		tet[17][1] = new int[] { 0, 0, 1, 1 };
		tet[18][0] = new int[] { 0, 0, 1, 1 };
		tet[18][1] = new int[] { 0, 1, 1, 2 };
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int c = 0; c < 19; c++) {
					int sum = 0;
					for (int d = 0; d < 4; d++) {
						int nr = i + tet[c][0][d];
						int nc = j + tet[c][1][d];
						if(!bound(nr,nc)) {
							break;
						}
						sum += arr[nr][nc];
						if(d==3) {
							max = Math.max(sum, max);
						}
					}
					
				}
			}
		}
	
		System.out.println(max);
	}

	private static boolean bound(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}

}