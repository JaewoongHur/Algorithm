import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static List<List<Integer>> list = new ArrayList<List<Integer>>();
	static int[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		visited = new int[N + 1];
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());			
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			list.get(u).add(v);
			list.get(v).add(u);
		}
		for (int i = 1; i <= N; i++) {
			Collections.sort(list.get(i));
		}

		bfs(R);

		for (int i = 1; i < N+1; i++) {
			bw.write(String.valueOf(visited[i]));
			bw.newLine();
		}
		br.close();
		bw.close();
	}

	public static void bfs(int Node) {
		Queue<Integer> q = new LinkedList<>();
		int cnt = 1;

		q.offer(Node);
		visited[Node] = cnt++;

		while (!q.isEmpty()) {
			int a = q.poll();

			for (int i = 0; i < list.get(a).size(); i++) {
				int nextNode = list.get(a).get(i);

				if (visited[nextNode] != 0) {
					continue;
				}
				q.offer(nextNode);
				visited[nextNode] = cnt++;
			}

		}

	}

}