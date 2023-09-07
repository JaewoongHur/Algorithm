import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());

			if (a == 1) {
				int x = Integer.parseInt(st.nextToken());
				stack.push(x);
			} else {
				switch (a) {
				case 2:
					if (!stack.isEmpty()) {
						sb.append(stack.pop()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					break;
				case 3:
					sb.append(stack.size()).append('\n');
					break;
				case 4:
					if (stack.isEmpty()) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
					break;
				case 5:
					if (!stack.isEmpty()) {
						sb.append(stack.peek()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					break;
				}

			}

		}
		System.out.println(sb);
	}
}