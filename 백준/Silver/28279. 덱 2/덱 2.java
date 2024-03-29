import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayDeque<Integer> d = new ArrayDeque<>();

		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());

			switch (a) {
			case 1:
				int b = Integer.parseInt(st.nextToken());
				d.addFirst(b);
				break;
			case 2:
				b = Integer.parseInt(st.nextToken());
				d.addLast(b);
				break;
			case 3:
				if (!d.isEmpty()) {
					sb.append(d.pollFirst()).append('\n');
				} else {
					sb.append(-1).append('\n');
				}
				break;
			case 4:
				if (!d.isEmpty()) {
					sb.append(d.pollLast()).append('\n');
				} else {
					sb.append(-1).append('\n');
				}
				break;
			case 5:
				sb.append(d.size()).append('\n');
				break;
			case 6:
				if (d.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				break;
			case 7:
				if (!d.isEmpty()) {
					sb.append(d.peekFirst()).append('\n');
				} else {
					sb.append(-1).append('\n');
				}
				break;
			case 8:
				if (!d.isEmpty()) {
					sb.append(d.peekLast()).append('\n');
				} else {
					sb.append(-1).append('\n');
				}
				break;
			}

		}
		System.out.println(sb);
	}
}