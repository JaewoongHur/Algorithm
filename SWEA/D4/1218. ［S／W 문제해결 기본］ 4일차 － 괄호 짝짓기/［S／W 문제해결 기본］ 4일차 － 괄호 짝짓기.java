import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int tc = 1;tc<=10;tc++) {
			int N = Integer.parseInt(br.readLine());
			String s = br.readLine();
			Stack<Character> stack = new Stack<>();
			for(int i = 0 ;i<N;i++) {
				char c = s.charAt(i);
				if(!stack.isEmpty()) {
					if(c==')' && stack.peek()=='(') {
						stack.pop();
					}
					else if(c==']' && stack.peek()=='[') {
						stack.pop();
					}
					else if(c=='}' && stack.peek()=='{') {
						stack.pop();
					}
					else if(c=='>' && stack.peek()=='<') {
						stack.pop();
					}
					else {
						stack.push(c);
					}
				}
				else {
					stack.push(c);
				}
			}
			sb.append("#").append(tc).append(' ');
			if(stack.isEmpty()) {	
				sb.append(1);
			}
			else {
				sb.append(0);
			}
			sb.append("\n");
		}	
		System.out.println(sb);
	}
}