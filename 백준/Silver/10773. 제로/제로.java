import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < K; i++) {
			int a = Integer.parseInt(br.readLine());
			if (a == 0) {
				if (!(stack.empty())) {
					stack.pop();
				}
			} else {
				stack.push(a);
			}
		}
		int sum = 0;
		int n = stack.size();
		if (stack.empty()) {
			bw.write(String.valueOf(0));
		} else {
			for (int i = 0; i < n; i++) {
				sum += stack.peek();
				stack.pop();
			}
			bw.write(String.valueOf(sum));
		}
		br.close();
		bw.close();
	}
}