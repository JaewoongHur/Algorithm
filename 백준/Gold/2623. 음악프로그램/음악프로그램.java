import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static ArrayList<Integer>[] list;
	static int[] degree;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		list = new ArrayList[n + 1];
		degree = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			list[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			for (int j = 1; j < num; j++) {
				int b = Integer.parseInt(st.nextToken());
				list[a].add(b);
				degree[b]++;
				a = b;
			}
		}

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			if(degree[i] == 0) {
				q.add(i);
			}
		}

		while(!q.isEmpty()) {
			int p = q.poll();
			sb.append(p).append('\n');
			for(int x : list[p]) {
				degree[x] --;
				if(degree[x] == 0) {
					q.add(x);
				}
			}			
		}
		boolean ps = true;
		for(int i=1;i<=n;i++) {
			if(degree[i] !=0) {
				ps = false;
				break;
			}
		}
		if(ps) {
			System.out.println(sb);
		}
		else {
			System.out.println(0);
		}
	}

}