import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] arr = new int[3][3];
		
		for(int i=0;i<3;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] dr = {-1,-1,-1,0,1,1,1,0};
		int[] dc = {-1,0,1,1,1,0,-1,-1};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j] == 9) continue;
				int cnt = 0;
				for(int d=0;d<8;d++) {
					int ni = i + dr[d];
					int nj = j + dc[d];
					
					if(ni < 0 || ni >= 3 || nj < 0 || nj >= 3) continue;
					
					if(arr[ni][nj] == 9) cnt++;
				}
				arr[i][j] = cnt;
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
