import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, H, day;
	static int[] dr = { -1, 0, 1, 0, 0, 0 };
	static int[] dc = { 0, 1, 0, -1, 0, 0 };
	static int[] dh = { 0, 0, 0, 0, -1, 1 };
	static int[][][] A;
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		A = new int[N][M][H];

		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					A[i][j][k] = Integer.parseInt(st.nextToken());
					if (A[i][j][k] == 1) {
						q.offer(new int[] { i, j, k, 0 });
					}
				}
			}
		}
		bfs();
		boolean check = true;
		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (A[i][j][k] == 0) {
						check = false;
						break;
					}
				}
			}
		}
		if (check) {
			System.out.println(day);
		} else {
			System.out.println(-1);
		}
	}

	static boolean boundaryCheck(int r, int c, int h) {
		return r >= 0 && r < N && c >= 0 && c < M && h >= 0 && h < H;
	}

	static void bfs() {
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];
			int h = p[2];
			day = p[3];
			for (int d = 0; d < 6; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				int nh = h + dh[d];
				if (!boundaryCheck(nr, nc, nh) || A[nr][nc][nh] == 1 || A[nr][nc][nh] == -1) {
					continue;
				}
				if (A[nr][nc][nh] == 0) {
					A[nr][nc][nh] = 1;
					q.offer(new int[] { nr, nc, nh, p[3] + 1 });
				}
			}
		}
	}
}