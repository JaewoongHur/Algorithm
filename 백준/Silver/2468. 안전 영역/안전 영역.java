import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, max,maxArea;
	static int[][] A;
	static boolean[][] sink , visit;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		A = new int[N][N];
		sink = new boolean[N][N];
		max = 0 ;
		int maxNumber = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				if (A[i][j] > maxNumber) {
					maxNumber = A[i][j];
				}
			}
		}
		for (int i = 0; i <= maxNumber; i++) {
			maxArea = 0;
			visit = new boolean[N][N];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (A[j][k] == i) {
						sink[j][k] = true;
					}
				}
			}

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (!sink[j][k]) {
						bfs(j,k);
					}
				}
			}
			max = Math.max(maxArea, max);
		}
		System.out.println(max);
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}

	static void bfs(int r, int c) {
		if(!visit[r][c]) {
			visit[r][c] = true;
		}
		else {
			return;
		}
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { r, c });
		maxArea++;
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int x = p[0];
			int y = p[1];
			for (int d = 0; d < 4; d++) {
				int nr = x + dr[d];
				int nc = y + dc[d];
				if (!boundaryCheck(nr, nc) || sink[nr][nc] || visit[nr][nc]) {
					continue;
				}
				q.offer(new int[] { nr, nc });
				visit[nr][nc] = true;
			}
		}
	}
}