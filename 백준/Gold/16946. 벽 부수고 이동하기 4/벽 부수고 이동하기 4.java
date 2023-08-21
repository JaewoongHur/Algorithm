import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] map, group,res;
	static boolean[][] visit;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static HashMap<Integer, Integer> h = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		group = new int[N][M];
		res = new int[N][M];
		visit = new boolean[N][M];
		String s;
		for (int i = 0; i < N; i++) {
			s = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		int num = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0 && group[i][j] == 0) {
					h.put(num, bfs(i, j, num));
					num++;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int cnt = 1;
				if (map[i][j] == 1) {
					Set<Integer> set = new HashSet<>();
					for (int k = 0; k < 4; k++) {
						int nr = i + dr[k];
						int nc = j + dc[k];
						if(!bound(nr,nc) ||group[nr][nc]==0) {
							continue;
						}
						set.add(group[nr][nc]);
					}
					for(int size: set) {
						cnt+= h.get(size);
					}
					res[i][j] += cnt%10;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				sb.append(res[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	static int bfs(int r, int c, int num) {
		int cnt = 1;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { r, c });
		group[r][c] = num;
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int x = p[0];
			int y = p[1];
			for (int d = 0; d < 4; d++) {
				int nr = x + dr[d];
				int nc = y + dc[d];
				if (!bound(nr, nc)) {
					continue;
				}
				if (group[nr][nc] == 0 && map[nr][nc] == 0) {
					group[nr][nc] = num;
					cnt++;
					q.add(new int[] { nr, nc });
				}
			}
		}
		return cnt;
	}

	static boolean bound(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}
}