import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<List<Integer>> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			list.get(x).add(y);
			list.get(y).add(x);
		}
		boolean[] visit = new boolean[n + 1];
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { a, 0 });
		visit[a] = true;
		int cnt = 0;
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int r = list.get(p[0]).size();
			if (p[0] == b) {
				cnt = p[1];
				break;
			}
			for (int i = 0; i < r; i++) {
				int k = list.get(p[0]).get(i);
				if (!visit[k]) {
					q.offer(new int[] { k, p[1] + 1 });
					visit[k] = true;
				}
			}
		}
		if (cnt > 0) {
			System.out.println(cnt);
		} else {
			System.out.println(-1);
		}
	}
}