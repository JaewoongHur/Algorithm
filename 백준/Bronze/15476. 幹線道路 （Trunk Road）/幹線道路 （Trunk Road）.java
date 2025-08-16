import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[n][m];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int sum = 0;
				for(int r=0;r<n;r++) {
					for(int c=0;c<m;c++) {
						if(r==i||c==j) continue;
						sum += Math.min(Math.abs(i-r), Math.abs(j-c)) * map[r][c];
					}
				}
				min = Math.min(min, sum);
			}
		}
		System.out.println(min);
	}
}