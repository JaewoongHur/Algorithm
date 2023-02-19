import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static char arr[][];
	static boolean visit[][];
	static int nowX;
	static int nowY;
	static int dr[] = { 0, 0, -1, 1 };
	static int dc[] = { -1, 1, 0, 0 };

	static int result = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new char[N][M];
		visit = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j] = s.charAt(j);				
			}
		}
		
		for (int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(!visit[i][j] && arr[i][j] == '-') {
					DFS(i,j,0,2,'-');
					result++;					
				}				
			}
		}
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(!visit[j][i] && arr[j][i] =='|') {
					DFS(j,i,2,4,'|');
					result++;					
				}				
			}
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.close();		
	}

	private static void DFS(int x, int y, int idxStart, int idxEnd, char ch) {
		visit[x][y] = true;

		for (int i = idxStart; i < idxEnd; i++) {
			nowX = dr[i] + x;
			nowY = dc[i] + y;
			if (range_check() && !visit[nowX][nowY] && arr[nowX][nowY] == ch) {
				DFS(nowX, nowY, idxStart, idxEnd, ch);
			}
		}
	}

	private static boolean range_check() {

		return nowX >= 0 && nowX < N && nowY >= 0 && nowY < M;
	}

}