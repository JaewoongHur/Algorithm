import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());

			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			boolean[][] visit = new boolean[N][N];

			int move = 0;

			int[] dr = { -2, -2, -1, -1, 1, 1, 2, 2 };
			int[] dc = { 1, -1, 2, -2, 2, -2, 1, -1 };

			Queue<int[]> q = new LinkedList<>();
			q.add(new int[] { x1, y1, 0 });
			visit[x1][y1] = true;

			while (!q.isEmpty()) {
				int[] p = q.poll();
				int r = p[0];
				int c = p[1];
				int cnt = p[2];
				
				if (r == x2 && c == y2) {
					move = cnt;
					break;
				}
				
				for(int d=0;d<8;d++) {		
					
					int nr = r + dr[d];
					int nc = c + dc[d];
					
					if(!boundaryCheck(nr,nc) || visit[nr][nc]) {
						continue;
					}
					q.add(new int[] {nr,nc,cnt+1});
					visit[nr][nc] = true;
				}
			}
			System.out.println(move);
		}

	}

	private static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}
}