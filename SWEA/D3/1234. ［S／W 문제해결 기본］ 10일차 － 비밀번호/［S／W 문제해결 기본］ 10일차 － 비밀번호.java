import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= 10; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			Stack<Integer> stack = new Stack<>();
			for (int i = N - 1; i >= 0; i--) { // 스택에 넣고 다시 뺄 때 순서 맞추기 위해서 뒤에서부터 넣기
				int a = s.charAt(i) - '0';

				if (!stack.isEmpty() && stack.peek() == a) { // 같은 숫자면 숫자 빼기
					stack.pop();
				}
				else {
					stack.push(a);
				}
			}
			sb.append("#").append(tc).append(' ');
			while(!stack.isEmpty()) {  // 비밀번호 숫자 합치기
				sb.append(stack.pop());
			}
			sb.append("\n");
		}
		System.out.println(sb); // 한번에 출력
	}
}