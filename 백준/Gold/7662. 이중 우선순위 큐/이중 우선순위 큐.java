import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int k = Integer.parseInt(br.readLine());

			PriorityQueue<Integer> minq = new PriorityQueue<>();
			PriorityQueue<Integer> maxq = new PriorityQueue<>(Collections.reverseOrder());
			HashMap<Integer, Integer> map = new HashMap<>();

			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				int a = Integer.parseInt(st.nextToken());

				if (s.equals("I")) {
					minq.add(a);
					maxq.add(a);

					map.put(a, map.getOrDefault(a, 0) + 1);
				} else if(s.equals("D")){
					if (map.size() == 0) {
						continue;
					}

					PriorityQueue<Integer> q = a == 1 ? maxq : minq;
					removeMap(q, map);
				}
			}
			
			if(map.size() == 0) {
				sb.append("EMPTY").append('\n');
			}
			else {
				int tmp = removeMap(maxq,map);
				sb.append(tmp);
				if(map.size() > 0) {
					sb.append(" " + removeMap(minq,map));
				}
				else {
					sb.append(" " + tmp);
				}
				sb.append('\n');
			}
			
		}
		System.out.println(sb);
	}

	private static int removeMap(PriorityQueue<Integer> q, HashMap<Integer, Integer> map) {
		int num;

		while (true) {
			num = q.poll();

			int cnt = map.getOrDefault(num, 0);

			if (cnt == 0) {
				continue;
			}

			if (cnt == 1) {
				map.remove(num);
			} else {
				map.put(num, cnt - 1);
			}
			break;
		}

		return num;
	}
}