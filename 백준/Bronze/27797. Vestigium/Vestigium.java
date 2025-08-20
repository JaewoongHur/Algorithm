import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][n];
			
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<n;j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int k = 0;
			int r = 0;
			int c = 0;
			
			for(int i=0;i<n;i++) {
				k+= arr[i][i];
			}
			
			for(int i=0;i<n;i++) {
				boolean[] check = new boolean[n+1];
				for(int j=0;j<n;j++) {
					if(check[arr[i][j]]) { 
						r++; 
						break;
					}else {
						check[arr[i][j]] = true;
					}				
				}
			}
			
			for(int i=0;i<n;i++) {
				boolean[] check = new boolean[n+1];
				for(int j=0;j<n;j++) {
					if(check[arr[j][i]]) { 
						c++; 
						break;
					}else {
						check[arr[j][i]] = true;
					}				
				}
			}
			
			System.out.println("Case #" + tc + ": " + k +" " + r + " " + c);
		}
	}
}