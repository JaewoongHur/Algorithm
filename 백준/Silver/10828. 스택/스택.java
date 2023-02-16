import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			s= st.nextToken();
			if (s.equals("push")) {
					stack.push(Integer.parseInt(st.nextToken()));
					continue;
				}
			 else if (s.equals("top")) {
				if (stack.empty()) {
					bw.write(String.valueOf(-1));
					bw.newLine();
				} else {
					bw.write(String.valueOf(stack.peek()));
					bw.newLine();
				}
				continue;
			} else if (s.equals("size")) {
				bw.write(String.valueOf(stack.size()));
				bw.newLine();
				continue;
			}
			else if (s.equals("pop")) {
				if(!(stack.empty())) {
				bw.write(String.valueOf(stack.peek()));
				bw.newLine();
				stack.pop();
				}
				else {
					bw.write(String.valueOf(-1));
					bw.newLine();
				}
				continue;
			} else {
				if (stack.empty()) {
					bw.write(String.valueOf(1));
					bw.newLine();
				} else {
					bw.write(String.valueOf(0));
					bw.newLine();
				}
				continue;
			}
		}
		br.close();
		bw.close();
	}
}