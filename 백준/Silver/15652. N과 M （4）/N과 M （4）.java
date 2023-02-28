import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int N = Integer.parseInt(s.split(" ")[0]);
		int M = Integer.parseInt(s.split(" ")[1]);
		arr = new int[M];
		dfs(N, M, 1, 0);
		System.out.println(sb);
	}

	public static void dfs(int N, int M, int start, int depth) {
		if (depth == M) {
			for (int x : arr) {
				sb.append(x + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i <= N; i++) {
			arr[depth] = i;
			dfs(N, M, i, depth + 1);
		}
	}
}