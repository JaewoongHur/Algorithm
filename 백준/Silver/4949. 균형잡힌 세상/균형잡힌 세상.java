import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		String s;
		out: while ((s = br.readLine()) != null) {
			if (s.charAt(0) == '.') {
				break out;
			}
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					stack.push('(');
				} else if (s.charAt(i) == ')') {
					stack.push(')');
				} else if (s.charAt(i) == '[') {
					stack.push('[');
				} else if (s.charAt(i) == ']') {
					stack.push(']');
				}

				if (!stack.isEmpty()) {
					if (stack.peek() == ']') {
						stack.pop();
						if (stack.empty()) {
							stack.push(' ');
							break;
						} else {
							if (stack.peek() == '[') {
								stack.pop();
							} else {
								cnt++;
								break;
							}
						}
					}

					else if (stack.peek() == ')') {
						stack.pop();
						if (stack.isEmpty()) {
							stack.push(' ');
							break;
						} else {
							if (stack.peek() == '(') {
								stack.pop();
							} else {
								cnt++;
								break;
							}
						}
					}
				}

				if (s.charAt(i) == '.') {
					break;
				}
			}
			if (stack.isEmpty()) {
				sb.append("yes\n");
			} else {
				while (!stack.isEmpty()) {
					stack.pop();
					cnt++;
				}
			}
			if (cnt > 0) {
				sb.append("no\n");
			}
		}
		System.out.println(sb);
	}
}