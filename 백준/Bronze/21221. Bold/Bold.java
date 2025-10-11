import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		char[][] map = new char[n][m];
		
		for(int i=0;i<n;i++) {
			String a = br.readLine();
			for(int j=0;j<m;j++) {
				map[i][j] = a.charAt(j);						
			}
		}
		
		char[][] map2 = new char[n][m];
		
		for(int i=0;i<n;i++) {
			Arrays.fill(map2[i], '.');
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j] == '#') {
					
					map2[i][j] = '#';
					
					if(i+1<n && map[i+1][j] == '.') {
						map2[i+1][j] = '#';
					}
					if(j+1<m && map[i][j+1] == '.') {
						map2[i][j+1] = '#';
					}
					if(i+1<n && j+1<m && map[i+1][j+1] == '.') {
						map2[i+1][j+1] = '#';
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sb.append(map2[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		
	}
}