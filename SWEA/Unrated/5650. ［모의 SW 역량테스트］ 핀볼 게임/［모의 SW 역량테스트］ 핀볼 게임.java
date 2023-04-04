import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	static int N, max, cnt, sr, sc;
	static int[][] arr;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static List<List<int[]>> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine().trim());
			arr = new int[N][N];

			list.clear();
			for (int i = 0; i < 5; i++) {
				list.add(new ArrayList<>());
			}

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine().trim(), " ");
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					if (arr[i][j] >= 6) {
						list.get(arr[i][j] - 6).add(new int[] { i, j });
					}
				}
			}

			max = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 0) {
						sr = i;
						sc = j;
						for (int d = 0; d < 4; d++) {
							cnt = 0;
							run(sr, sc, d);
							max = Math.max(cnt, max);
						}

					}
				}
			}
			System.out.println("#"+tc+" "+max);
		}		
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}

	static void run (int r, int c, int d) {
		while(true) {
			r += dr[d];
			c += dc[d];
			if (!boundaryCheck(r, c)) {
				d += 2;
				d %= 4;
				r += dr[d];
				c += dc[d];
				cnt++;
			}
			if (arr[r][c] == -1 || (r == sr && c == sc)) {
				return;
			}

			else if (arr[r][c] == 1) {
				if (d == 0 || d == 1) {
					d += 2;
				} else if (d == 2) {
					d = 1;
				} else {
					d = 0;
				}
				cnt++;
			} else if (arr[r][c] == 2) {
				if (d == 2 || d == 1) {
					d += 2;
					d %= 4;
				} else if (d == 0) {
					d = 1;
				} else {
					d = 2;
				}
				cnt++;
			} else if (arr[r][c] == 3) {
				if (d == 0) {
					d = 3;
				} else if (d == 1) {
					d = 2;
				} else {
					d += 2;
					d %= 4;
				}
				cnt++;
			} else if (arr[r][c] == 4) {
				if (d == 1) {
					d = 0;
				} else if (d == 2) {
					d = 3;
				} else {
					d += 2;
					d %= 4;
				}
				cnt++;
			} else if (arr[r][c] == 5) {
				
				d += 2;
				d %= 4;
				cnt++;
			}

			else if (arr[r][c] >= 6) {
				int[] pair = wormhole(r, c, d);
				r = pair[0];
				c = pair[1];
			}
		
		}

	}

	static int[] wormhole(int r, int c, int dir) {
		int[] w = new int[2];
		for (int i = 0; i < 2; i++) {
			int[] a = list.get(arr[r][c] - 6).get(i);
			int x = a[0];
			int y = a[1];

			if (x != r || y != c) {
				w[0] = x;
				w[1] = y;
			}
		}
		return w;
	}

}