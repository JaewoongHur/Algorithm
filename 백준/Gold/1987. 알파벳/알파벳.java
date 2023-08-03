import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	static int N,M;
	static char[][] map;
	static boolean[] alpha;
	static int[] dr = {-1,0,1,0};
	static int[] dc = {0,1,0,-1};
	static int max = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		alpha = new boolean[26];
		String s;
		for(int r=0;r<N;r++) {
			s = br.readLine();
			for(int c=0;c<M;c++) {
				map[r][c] = s.charAt(c);				
			}
		}
		
		dfs(0,0,1);
		System.out.println(max);
	}

	static void dfs(int a, int b, int len) {
		alpha[map[a][b]-'A'] = true;
		
		max = Math.max(max, len);
		
		for(int d=0;d<4;d++) {
			int nr = a + dr[d];
			int nc = b + dc[d];
			if(!bnd(nr,nc)|| alpha[map[nr][nc]-'A']) {
				continue;
			}
			dfs(nr,nc,len+1);
			alpha[map[nr][nc]-'A'] = false;
		}
		
	}	
	
	static boolean bnd(int r, int c) {
		return r>=0 && r<N && c>=0 && c<M;
	}
	
}