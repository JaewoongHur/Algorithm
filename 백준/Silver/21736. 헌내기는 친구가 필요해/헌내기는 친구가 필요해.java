import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[N][M];
		boolean[][] visit = new boolean[N][M];
		String s ;
		
		int sx = 0;
		int sy = 0;
		
		for(int i=0;i<N;i++) {
			s=br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j] = s.charAt(j);
				if(arr[i][j] == 'I') {
					sx = i; sy = j;
				}
			}
		}
		int people = 0;
		int[] dr = {-1,0,1,0};
		int[] dc = {0,1,0,-1};
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {sx,sy});
		visit[sx][sy] = true;
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];
			for(int d=0;d<4;d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if(!bound(nr,nc,N,M)||visit[nr][nc]||arr[nr][nc] == 'X') {
					continue;
				}
				if(arr[nr][nc]=='P') {
					people++;
				}
				visit[nr][nc] = true;
				q.add(new int[] {nr,nc});
			}
			
		}		
		if(people>0) {
		System.out.println(people);
		}
		else {
			System.out.println("TT");
		}
		
	}
	private static boolean bound(int r, int c,int n, int m) {
		return r>=0 && r<n && c>=0 && c<m;
	}
}