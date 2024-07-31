import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] t = br.readLine().split(" ");
		
		int n = Integer.parseInt(t[0]);
		int m = Integer.parseInt(t[1]);
		
		char[][] map = new char[n][m];
		
		for(int r=0;r<n;r++) {
			String s = br.readLine();
			for(int c=0;c<m;c++) {
				map[r][c] = s.charAt(c);				
			}
		}
		
		int a0 = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		
		int[] dr = new int[] {0,0,1,1};
		int[] dc = new int[] {0,1,0,1};
		
		for(int r=0;r<n-1;r++) {
			for(int c=0;c<m-1;c++) {
				if(map[r][c]=='#' || map[r][c+1]=='#'||map[r+1][c]=='#'||map[r+1][c+1]=='#') continue;
				
				int f = 0; // 주차된 공간 full
				
				for(int d=0;d<4;d++) {
					if(map[r+dr[d]][c+dc[d]] == 'X') {
						f++;
					}					
				}
				
				if(f==0) {
					a0++;
				}else if(f==1) {
					a1++;
				}else if(f==2) {
					a2++;
				}else if(f==3) {
					a3++;
				}else if(f==4) {
					a4++;
				}
			}
		}
		System.out.println(a0);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}