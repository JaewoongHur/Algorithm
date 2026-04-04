import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		List<Queue<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(new LinkedList<>());
		}

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			cnt += a;
			for (int j = 0; j < a; j++) {
				int b = Integer.parseInt(st.nextToken());
				list.get(i).add(b);
			}
		}

		for (int i = 0; i < cnt; i++) {
			int min = Integer.MAX_VALUE;
			int idx = 0;
			for (int j = 0; j < n; j++) {
				if(list.get(j).isEmpty()) continue;
				
				if(min > list.get(j).peek()) {
					idx = j;
					min = list.get(j).peek();
				}
			}
			list.get(idx).poll();
			sb.append((char)('A' + idx));
		}
		
		System.out.println(sb);

	}
}
