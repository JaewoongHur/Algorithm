import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static String par(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else if (stack.empty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			System.out.println(par(s));
		}
		sc.close();
	}
}