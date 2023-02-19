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
		StringBuilder sb = new StringBuilder(); // 출력할 결과물 저장
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());

		int start = 0;

		while (N-- > 0) {

			int value = Integer.parseInt(br.readLine());

			if (value > start) {

				for (int i = start + 1; i <= value; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				start = value;
			}

			else if (stack.peek() != value) {
				bw.write("NO");
				br.close();
				bw.close();
				return; // or System.exit(0);
			}

			stack.pop();
			sb.append("-\n");

		}
		bw.write(sb.toString());
		br.close();
		bw.close();
	}
}