import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(Integer.parseInt(br.readLine()));
		
		for(int i=1;i<N;i++) {
			int a = Integer.parseInt(br.readLine());
			while(!stack.isEmpty() && a>=stack.peek()) {
				stack.pop();
			}
			stack.push(a);
		}
		
		System.out.println(stack.size());	
	}
}