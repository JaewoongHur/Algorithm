import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int n = sc.nextInt();
			String s = sc.next();
			Stack<Character> stack = new Stack<>();
			String newS = "";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c-'0'>=0 && c-'0'<=9) {
					newS += String.valueOf(c);
				} 
				else {
					if (stack.isEmpty()) {
						stack.push(c);
					} else {
						newS += String.valueOf(stack.pop());
						stack.push(c);
						}
					}
				}
				while (!stack.isEmpty()) {
					newS += stack.pop();
				}
			
			
			Stack<Integer> stack2 = new Stack<>();
			for (int i = 0; i < newS.length(); i++) {
				char c = newS.charAt(i);
				if ((c-'0')<=9 && (c-'0')>=0) {
					stack2.push(c - '0');
				} else {
					int a1 = stack2.pop();
					int a2 = stack2.pop();
					stack2.push(a1 + a2);
				}
			}
			System.out.println("#" + tc + " " + stack2.pop());
		}
	}
}