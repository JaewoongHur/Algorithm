import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
	static int cnt;
	static int[] order;

	public static void dfs(int Node) {
		order[Node] = cnt;

		for (int i = 0; i < edges.get(Node).size(); i++) {
			int nowNode = edges.get(Node).get(i);

			if (order[nowNode] == 0) {
				cnt++;
				dfs(nowNode);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		order = new int[N + 1];

		for (int i = 0; i < N + 1; i++) {
			edges.add(new ArrayList<>());
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			edges.get(u).add(v);
			edges.get(v).add(u);
		}
		for (int i = 1; i < edges.size(); i++) {
			Collections.sort(edges.get(i));
		}
		cnt = 1;
		dfs(R);

		for (int i = 1; i < order.length; i++) {
			bw.write(String.valueOf(order[i]));
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}