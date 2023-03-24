import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, D, enemy, max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		int[][] O = new int[N + 1][M];
		int[][] A = new int[N+1][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				O[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		max = Integer.MIN_VALUE;
		for (int i = 0; i < M - 2; i++) {
			for (int j = i + 1; j < M - 1; j++) {
				for (int k = j + 1; k < M; k++) {
					copy(O,A);
					enemy = 0;
					combi(i, j, k, A);
					max = Math.max(max, enemy);
				}
			}
		}
		System.out.println(max);
	}

	static boolean boundaryCheck(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}

	static void move(int[][] A) {
		for (int i = 0; i < M; i++) {
			for (int j = N - 2; j >= 0; j--) {
				A[j + 1][i] = A[j][i];
			}
			A[0][i] = 0;
		}
	}

	static void copy(int[][] A, int[][] B) {
		for (int i = 0; i < N + 1; i++) {
			for (int j = 0; j < M; j++) {
				B[i][j] = A[i][j];
			}
		}
	}

	static void combi(int i, int j, int k, int[][] A) {

		for (int a = 0; a < N; a++) {

			out: for (int m = 1; m <= D; m++) {
				for (int x = -m + 1; x <= m - 1; x++) {
					int y = Math.abs(x);
					if (boundaryCheck(N - m + y, i + x) && A[N - m + y][i + x] == 1) {
						A[N - m + y][i + x] = -1;
						break out;
					}

				}
			}
			out: for (int m = 1; m <= D; m++) {
				for (int x = -m + 1; x <= m - 1; x++) {
					int y = Math.abs(x);
					if (boundaryCheck(N - m + y, j + x) && (A[N - m + y][j + x] == 1 || A[N - m + y][j + x] == -1)) {
						A[N - m + y][j + x] = -2;
						break out;
					}
				}
			}
			out: for (int m = 1; m <= D; m++) {
				for (int x = -m + 1; x <= m - 1; x++) {
					int y = Math.abs(x);
					if (boundaryCheck(N - m + y, k + x)
							&& (A[N - m + y][k + x] == 1 || A[N - m + y][k + x] == -1 || A[N - m + y][k + x] == -2)) {
						A[N - m + y][k + x] = -3;
						break out;
					}
				}
			}
	

			for (int b = 0; b < N; b++) {
				for (int c = 0; c < M; c++) {
					if (A[b][c] < 0) {
						enemy++;
						A[b][c] = 0;
					}
				}
			}

			move(A);

		}
	}
}