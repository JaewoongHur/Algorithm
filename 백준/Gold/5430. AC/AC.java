import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		out: for (int tc = 1; tc <= T; tc++) {
			LinkedList<Integer> dq = new LinkedList<>();
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			boolean reverse = false;

			s = s.substring(1, s.length() - 1);
			st = new StringTokenizer(s, ",");
			for (int i = 0; i < n; i++) {
				dq.add(Integer.parseInt(st.nextToken()));
			}

			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) == 'R') {
					if (reverse) {
						reverse = false;
					} else {
						reverse = true;
					}
				} else if (p.charAt(i) == 'D') {
					if (dq.isEmpty()) {
						sb.append("error").append("\n");
						continue out;
					} else {
						if (reverse) {
							dq.pollLast();
						} else {
							dq.poll();
						}
					}
				}
			}
			sb.append('[');

			int k = dq.size();
			for (int i = 0; i < k - 1; i++) {
				if (reverse) {
					sb.append(dq.pollLast()).append(',');
				} else {
					sb.append(dq.poll()).append(',');
				}
			}
			if (k == 0) {
				sb.append(']').append("\n");
			} else {
				sb.append(dq.poll()).append(']').append("\n");
			}
		}
		System.out.println(sb);
	}
}