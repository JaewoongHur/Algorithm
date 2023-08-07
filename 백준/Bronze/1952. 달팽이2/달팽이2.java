import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int a , b;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b= Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[a][b];
		boolean[][] visit = new boolean[a][b];
		
		int[] dr = {0,1,0,-1};
		int[] dc = {1,0,-1,0};
		
		int cnt = 0;
		int r =0 ; int c=0;
		visit[0][0] = true;
		int num = 1;
		out:while(true) {
			for(int d=0;d<4;d++) {
				int nr = r+dr[d];
				int nc = c+dc[d];
				while(bound(nr,nc) && !visit[nr][nc]) {
					visit[nr][nc] = true;
					num ++;
					r=nr;
					c=nc;
					nr+= dr[d];
					nc+= dc[d];
				}
				if(num==a*b) {
					break out;
				}
				cnt++;
				
			}
			
		}
		System.out.println(cnt);
	}
	static boolean bound(int r, int c) {
		return r>=0 && r<a && c>=0 && c<b;
	}
}