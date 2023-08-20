import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int[][] map;
	static boolean end;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		map = new int[9][9];

		for (int i = 0; i < 9; i++) {
			String s = br.readLine();
			for (int j = 0; j < 9; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		dfs(0);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sb.append(map[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	static void dfs(int depth) {
		if (depth == 81) {
			end = true;
			return;
		}

		int r = depth / 9;
		int c = depth % 9;

		if (map[r][c] != 0) {
			dfs(depth + 1);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (!isPossible(r, c, i))
					continue;
				map[r][c] = i;
				dfs(depth + 1);
				if (end)
					return;
				map[r][c] = 0;
			}
		}

	}

	private static boolean isPossible(int r, int c, int n) {
		for (int i = 0; i < 9; i++) {
			if (map[r][i] == n || map[i][c] == n)
				return false;
		}
		int nr = r / 3 * 3;
		int nc = c / 3 * 3;
		for (int i = nr; i < nr + 3; i++) {
			for (int j = nc; j < nc + 3; j++) {
				if (map[i][j] == n)
					return false;
			}
		}
		return true;
	}

}