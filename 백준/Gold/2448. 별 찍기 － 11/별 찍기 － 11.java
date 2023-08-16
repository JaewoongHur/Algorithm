import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static char[][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		map = new char[N][2*N-1];
		for(int i=0;i<N;i++) {
			Arrays.fill(map[i],' ');
		}
		dfs(0,N-1,N);
		for(int i=0;i<N;i++) {
			for(int j=0;j<2*N-1;j++) {
				sb.append(map[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	static void dfs(int r, int c, int idx) {
		if (idx == 3) {
			map[r][c] = '*';
			map[r+1][c+1] =map[r+1][c-1] ='*';
			for(int i=-2;i<=2;i++) {
				map[r+2][c+i] = '*';
			}
		return;
	}
		
		dfs(r,c,idx/2);
		dfs(r+idx/2,c-idx/2,idx/2);
		dfs(r+idx/2,c+idx/2,idx/2);
		
	}
}