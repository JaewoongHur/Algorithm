import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] map = new int[n][n];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			int h = 0;
			int v = 0;
			for(int j=0;j<n;j++) {
				if(h < map[j][i]) {
					h = map[j][i];
					v++;
				}
			}			
			sb.append(v).append(' ');
		}
		
		sb.append('\n');
		
		for(int i=0;i<n;i++) {
			int h = 0;
			int v = 0;
			for(int j=0;j<n;j++) {
				if(h < map[i][j]) {
					h = map[i][j];
					v++;
				}
			}			
			sb.append(v).append('\n');
		}
		
		System.out.println(sb);
		
	}
}