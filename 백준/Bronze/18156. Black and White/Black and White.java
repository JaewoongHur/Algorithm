import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[][] map = new char[n][n];
		
		boolean pass = true;
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			for(int j=0;j<n;j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		
		for(int i=0;i<n;i++) {
			int b = 0;
			int w = 0;
			for(int j=0;j<n;j++) {
				if(map[i][j] == 'B') {
					b++;
				}else {
					w++;
				}
				
				if(j<n-2) {
					if(map[i][j] == map[i][j+1] && map[i][j+1] == map[i][j+2]) {
						pass = false;
						break;
					}
				}
				
			}
			if(b != w) {
				pass = false; 
				break;
			}
		}
		
		for(int i=0;i<n;i++) {
			int b = 0;
			int w = 0;
			for(int j=0;j<n;j++) {
				if(map[j][i] == 'B') {
					b++;
				}else {
					w++;
				}
				
				if(j<n-2) {
					if(map[j][i] == map[j+1][i] && map[j+1][i] == map[j+2][i]) {
						pass = false;
						break;
					}
				}
				
			}
			if(b != w) {
				pass = false; 
				break;
			}
		}
		
		if(pass) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}
