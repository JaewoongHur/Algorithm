import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
	static int N, H, W, min;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			int[][] A = new int[H][W];

			for (int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < W; j++) {
					A[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			min = Integer.MAX_VALUE;
			dropNtimes(0, A);
			sb.append("#").append(tc).append(' ').append(min);
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < H && c >= 0 && c < W;
	}

	static void dropNtimes(int d, int[][] A) {
		if (d == N) {
			min = Math.min(min, countRemainBricks(A));
			return;
		}
		int[][] B = new int[H][W];

		for (int i = 0; i < W; i++) {
			copy(A, B);
			drop(i, B);
			sort(B);
			dropNtimes(d + 1, B);

		}

	}

	static int countRemainBricks(int[][] A) {
		int cnt = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (A[i][j] != 0) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	static void sort(int[][] B) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				if (B[j][i] != 0) {
					stack.push(B[j][i]);
				}
			}

			for (int j = H - 1; j >= 0; j--) {
				if (!stack.isEmpty()) {
					B[j][i] = stack.pop();
				} else {
					B[j][i] = 0;
				}
			}
		}
	}

	static void drop(int c, int[][] B) {
		for (int i = 0; i < H; i++) {
			if (B[i][c] != 0) {
				explosion(i, c, B);
				break;
			}
		}
	}

	static void explosion(int r, int c, int[][] B) {
		Queue<int[]> q = new LinkedList<>();
		if (B[r][c] != 0) {
			q.offer(new int[] { r, c, B[r][c] });
			B[r][c] = 0 ;
		}

		while (!q.isEmpty()) {
			int[] p = q.poll();
			for (int i = 0; i < 4; i++) {
				int nr = p[0];
				int nc = p[1];
				int size = p[2] - 1;
				while (size-- > 0) {
					nr += dr[i];
					nc += dc[i];
					if (boundaryCheck(nr, nc) && B[nr][nc] != 0) {
						q.offer(new int[] { nr, nc, B[nr][nc] });
						B[nr][nc] = 0;
					}
				}
			}
		}
	}

	static void copy(int[][] A, int[][] B) {
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				B[i][j] = A[i][j];
			}
		}
	}
}