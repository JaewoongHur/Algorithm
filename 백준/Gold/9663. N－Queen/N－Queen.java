import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N;
	static boolean[] diag_down;
	static boolean[] diag_up;
	static boolean[] col;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		col = new boolean[N];
		diag_up = new boolean[2 * N - 1];
		diag_down = new boolean[2 * N - 1];
		cnt = 0;
		queenSearch(0);
		System.out.println(cnt);
	}

	public static void queenSearch(int r) {
		if (r == N) {
			cnt++;
			return;
		}

		for (int c = 0; c < N; c++) {
			if (col[c] || diag_up[r + c] || diag_down[N - 1 + c - r]) {
				continue;
			}
			col[c] = true;
			diag_up[r + c] = true;
			diag_down[N - 1 + c - r] = true;
			queenSearch(r + 1);
			col[c] = false;
			diag_up[r + c] = false;
			diag_down[N - 1 + c - r] = false;
		}
	}
}