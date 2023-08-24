import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] parent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
		int a = 0;
		int b = 0;
		int num = 0;
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if (!union(a, b)) {
				num = i;
				break;
			}
		}
		System.out.println(num);
	}

	static int find(int x) {
		if (x == parent[x])
			return x;
		parent[x] = find(parent[x]);
		return parent[x];
	}

	static boolean union(int x, int y) {
		int a = find(x);
		int b = find(y);
		if (a == b)
			return false;
			parent[b] = a;
		return true;

	}
}