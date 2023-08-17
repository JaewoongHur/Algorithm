import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Node {
	int end;
	int value;

	public Node(int end, int value) {
		this.end = end;
		this.value = value;
	}

}

public class Main {
	static int n, res, k;
	static boolean[] visit, leap;
	static ArrayList<Node>[] tree;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		res = 0;
		k=0;
		leap = new boolean[n + 1];
		visit = new boolean[n + 1];
		tree = new ArrayList[n + 1];
		for (int i = 0; i <= n; i++) {
			tree[i] = new ArrayList<>();
		}
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int a = 0;
			int b = 0;
			int c = 0;
			while (true) {
				a = Integer.parseInt(st.nextToken());
				if (a == -1) {
					break;
				}
				b = Integer.parseInt(st.nextToken());

				tree[d].add(new Node(a, b));
				c++;
			}
			if (c == 1) {
				leap[d] = true;
			}
		}
		dfs(1,0);
		Arrays.fill(visit, false);
		dfs(k,0);
		System.out.println(res);
	}

	static void dfs(int idx, int s) {
		visit[idx] = true;
		if(res<s && leap[idx]) {
			res = s;
			k = idx;
			return;
		}

		for (Node node : tree[idx]) {
			if (visit[node.end]) {
				continue;
			}
			dfs(node.end, s + node.value);
		}
	}
}