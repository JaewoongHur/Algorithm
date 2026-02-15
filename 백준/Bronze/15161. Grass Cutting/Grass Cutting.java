import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] map = new int[11][11];
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				map[i][j] = 1;
			}
		}
		
		for(int tc=0;tc<n;tc++) {
			for(int i=1;i<=10;i++) {
				for(int j=1;j<=10;j++) {
					map[i][j]++;
				}
			}
			
			
			st = new StringTokenizer(br.readLine());
			
			int r1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int r3 = Integer.parseInt(st.nextToken());
			int c1 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());
			int c3 = Integer.parseInt(st.nextToken());
			
			for(int i=1;i<=10;i++) {
				map[r1][i] = 1;
				map[r2][i] = 1;
				map[r3][i] = 1;
				map[i][c1] = 1;
				map[i][c2] = 1;
				map[i][c3] = 1;
			}
		}
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
