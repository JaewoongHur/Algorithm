import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int K, H, W, min;
	static int[][] arr;
	static boolean[][][] visit;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int[] kr = { -2, -1, 1, 2, 2, 1, -1, 2 };
	static int[] kc = { 1, 2, 2, 1, -1, -2, -2, -1 };
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		K = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());

		arr = new int[H][W];
		visit = new boolean[H][W][K+1];
		

		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		min = Integer.MAX_VALUE;

		bfs();
		if (min == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(min);
		}

	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < H && c >= 0 && c < W;
	}

	static void bfs() {
		q.add(new int[] { 0, 0, 0, 0 });
		visit[0][0][0] = true;

		while (!q.isEmpty()) {
			int[] p = q.poll();
			int x = p[0];
			int y = p[1];
			int move = p[2];
			int knight = p[3];
			
			if (x == H - 1 && y == W - 1) {
				min = Math.min(min, move);
				continue;
			}

			for (int d = 0; d < 4; d++) {
				int nr = x + dr[d];
				int nc = y + dc[d];
				if (!boundaryCheck(nr, nc) || arr[nr][nc] == 1 || visit[nr][nc][knight]) {
					continue;
				}
				q.add(new int[] { nr, nc, move + 1, knight });
				visit[nr][nc][knight] = true;
			}
			if(knight<K) {
				for (int d = 0; d < 8; d++) {
					int nr = x + kr[d];
					int nc = y + kc[d];
					if (!boundaryCheck(nr, nc) || arr[nr][nc] == 1 || visit[nr][nc][knight+1]) {
						continue;
					}
					q.add(new int[] { nr, nc, move + 1, knight + 1 });
					visit[nr][nc][knight+1] = true;
				}
			}
		}
		
	}

}