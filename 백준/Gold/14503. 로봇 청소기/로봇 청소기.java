import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, d, countRoom;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static boolean[][] clean;
	static int[][] A;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		clean = new boolean[N][M];
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs(r, c);
		System.out.println(countRoom);
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}

	static void bfs(int a, int b) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { a, b });
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];
			if (!clean[r][c]) {
				clean[r][c] = true;
				countRoom++;
			}
			boolean check = false;
			for (int i = 1; i <= 4; i++) {
				int x = d - i;
				if (x < 0) {
					x += 4;
				}
				int nr = r + dr[x];
				int nc = c + dc[x];
				if (!boundaryCheck(nr, nc) || clean[nr][nc] || A[nr][nc] == 1) {
					continue;
				}
				check = true;
				q.offer(new int[] { nr, nc });
				d = x;
				break;
			}
			if (!check) {
				int x = d + 2;
				x %= 4;
				int nr = r + dr[x];
				int nc = c + dc[x];
				if (boundaryCheck(nr, nc) && A[nr][nc] == 0) {
					q.offer(new int[] { nr, nc });
					continue;
				}
				break;
			}
		}
	}
}