import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int N, sR,sC,x,y,total;
	static int[] dr= {-1,0,1,0}; 
	static int[] dc= {0,1,0,-1};
	static boolean[][] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		sR=0;sC=0;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 9) {
					sR= i;
					sC= j;
					arr[i][j] = 0;
				}
			}
		}

		total = 0;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {sR,sC,2,0,0});
		
		while(!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];
			int size = p[2];
			int eat = p[3];
			
			
			x = -1;
			y = -1;

			find(r,c,size);
			
			
			
			if(x==-1 && y== -1) {
				System.out.println(total);
				break;
			}
			else {
				eat++;			
				arr[x][y] = 0;
				if(eat==size) {
					size++;
					eat = 0;
				}
				q.add(new int[] {x,y,size,eat});
			}	
		}
		
	}
	static void find(int r, int c, int size) {
		Queue<int[]> q2 =new LinkedList<>();
		q2.add(new int[] {r,c,0});
		visit = new boolean[N][N];
		visit[r][c] = true;
		
		int dist = Integer.MAX_VALUE;
		int fx = -1;
		int fy = -1;
		
		while(!q2.isEmpty()) {
			int[] p = q2.poll();
			int tx = p[0];
			int ty = p[1];			
			int a = p[2];
			if(arr[tx][ty]>0 && arr[tx][ty]<size) {
			
			if(dist<a) {
				continue;
			}			
				
			if(dist>a) {
				dist = a;
				fx = tx;
				fy = ty;
			}
			else if(dist==a) {
				if(fx>tx) {
					fx = tx;
					fy = ty;
				}
				else if(fx==tx) {
					if(fy>ty) {
						fx = tx;
						fy = ty;
					}
				}
			}
		}
			
		for(int d=0;d<4;d++) {
			int nr = tx+ dr[d];
			int nc = ty + dc[d];
			if(!bound(nr,nc) || visit[nr][nc] || arr[nr][nc]>size) {
				continue;
			}
			visit[nr][nc] = true;
			q2.add(new int[] {nr,nc,a+1});
			}		
		}
		x=fx;
		y=fy;	
		if(dist==Integer.MAX_VALUE) {
			dist = 0;
		}
		total+=dist;
	}
	
	
	
	static boolean bound(int r ,int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}
	
	
}