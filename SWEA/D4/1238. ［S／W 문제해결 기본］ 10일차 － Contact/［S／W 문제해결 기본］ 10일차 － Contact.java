import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static List<List<Integer>> list = new ArrayList<>();
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = 10;

		for (int tc = 1; tc <= T; tc++) {
			list = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			
			for(int i=0;i<=100;i++) {
				list.add(new ArrayList<>());
			}
			
			visit = new boolean[101];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<n/2;i++) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				list.get(a).add(b);
			}
			
			Queue<int[]> q = new LinkedList<>();
			q.add(new int[] {start,0});
			visit[start] = true;
			int last = 0;
			int lastNode = start;
			while(!q.isEmpty()) {
				int[] p = q.poll();
			
				if(p[1] > last) {
					last = p[1];
					lastNode = 0;
				}
				if(p[1]==last) {
					if(p[0]>lastNode) {
						lastNode = p[0];
					}
				}

				for(int end: list.get(p[0])) {
					if(visit[end]) {
						continue;
					}
					q.add(new int[] {end,p[1]+1});
					visit[end] = true;
				}
			}

			sb.append("#"+tc+" ").append(lastNode).append("\n");
		}
		System.out.println(sb);
	}
}