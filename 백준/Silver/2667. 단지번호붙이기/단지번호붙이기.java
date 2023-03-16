import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	static int N;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int[][] A;
	static boolean[][] visit;
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		A = new int[N][N];
		visit = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				A[i][j] = s.charAt(j) - 48;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visit[i][j] && A[i][j] == 1) {
				list.add(bfs(i, j));
				}
			}
		}
		Collections.sort(list);
		sb.append(list.size()).append("\n");
		for(int x : list) {
			sb.append(x).append("\n");
		}
		System.out.println(sb);
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}

	static int bfs(int a, int b) {
		int cnt = 0;
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { a, b });
		visit[a][b] = true;
		cnt++;
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int r = p[0];
			int c = p[1];
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (!boundaryCheck(nr, nc) || visit[nr][nc] || A[nr][nc] == 0) {
					continue;
				}
				q.offer(new int[] {nr,nc});
				visit[nr][nc] = true;
				cnt++;
			}
		}
		return cnt;
	}
}