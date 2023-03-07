import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, min, countZero;
	static int[][] A;
	static boolean[][] visit;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static Queue<int[]> originQ = new LinkedList<int[]>();
	static List<int[]> al = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str = br.readLine();
		N = Integer.parseInt(str.split(" ")[0]);
		M = Integer.parseInt(str.split(" ")[1]);
		A = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				if (A[i][j] == 2) {
					al.add(new int[] { i, j });
				}
				if (A[i][j] == 0) {
					countZero++;
				}
			}
		}
		countZero -= 3;
		min = Integer.MAX_VALUE;
		dfs(0, 0, 0);
		System.out.println(countZero - min);
	}

	static void dfs(int r, int c, int depth) {
		if (depth == 3) {
			min = Math.min(min, bfs(0));
			return;
		}

		for (int i = 0; i < N; i++) {
			if (i < r) {
				continue;
			}
			for (int j = 0; j < M; j++) {
				if (i == r && j < c) {
					continue;
				}
				if (A[i][j] == 0) {
					A[i][j] = 1;
					dfs(i, j + 1, depth + 1);
					A[i][j] = 0;
				}

			}

		}

	}

	static int bfs(int cnt) {
		visit = new boolean[N][M];
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < al.size(); i++) {
			q.offer(new int[] { al.get(i)[0], al.get(i)[1] });
		}

		while (!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];

			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (!boundaryCheck(nr, nc) || visit[nr][nc] || A[nr][nc] == 1) {
					continue;
				}
				if (A[nr][nc] == 0) {
					q.offer(new int[] { nr, nc });
					visit[nr][nc] = true;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (visit[i][j]) {
					cnt++;
				}
			}
		}

		return cnt;
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}
}