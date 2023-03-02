import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		arr = new int[9][9];

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		solve(0, 0);

	}

	static void solve(int r, int c) {
		if (r == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}

		if (arr[r][c] != 0) {
			if (c == 8) {
				solve(r + 1, 0);
			} else {
				solve(r, c + 1);
			}
			return;
		} else {
			for (int val = 1; val <= 9; val++) {
				if (!rowCheck(r, c, val) || !colCheck(r, c, val) || !squareCheck(r, c, val)) {
					continue;
				}
				arr[r][c] = val;

				if (c == 8) {
					solve(r + 1, 0);
				} else {
					solve(r, c + 1);
				}
				arr[r][c] = 0;
			}
		}
	}

	static boolean rowCheck(int r, int c, int val) {
		for (int i = 0; i < 9; i++) {
			if (arr[r][i] == val) {
				return false;
			}
		}
		return true;
	}

	static boolean colCheck(int r, int c, int val) {
		for (int i = 0; i < 9; i++) {
			if (arr[i][c] == val) {
				return false;
			}
		}
		return true;
	}

	static boolean squareCheck(int r, int c, int val) {
		int a = r % 3;
		int b = c % 3;
		for (int i = r - a; i < r - a + 3; i++) {
			for (int j = c - b; j < c - b + 3; j++) {
				if (arr[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}

}