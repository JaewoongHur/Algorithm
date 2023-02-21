import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static int getPriority(char c) {
		switch (c) {
		case '*':
		case '/':
			return 1;
		case '+':
		case '-':
			return 2;
		case '(':
			return 3;
		default:
			return -1;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(c);
			} else if (c == ')') {
				char d = stack.pop();
				while (!stack.isEmpty() && d != '(') {
					sb.append(d);
					d = stack.pop();
				}
			} else {
				if (stack.isEmpty()) {
					stack.push(c);
				}

				else {
					if (c == '(') {
						stack.push(c);
					} else if (getPriority(stack.peek()) <= getPriority(c)) {
						while(!stack.isEmpty()&&getPriority(stack.peek())<=getPriority(c)) {
						sb.append(stack.pop());
						}
						stack.push(c);
					} else {
						stack.push(c);
					}
				}

			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}
}