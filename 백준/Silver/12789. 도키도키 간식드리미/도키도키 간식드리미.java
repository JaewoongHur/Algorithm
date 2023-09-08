import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Stack<Integer> s = new Stack<>();
		Stack<Integer> tmp = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
		boolean[] check = new boolean[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = n - 1; i >= 0; i--) {
			s.push(arr[i]);
		}

		boolean poss = true;

		int idx = 1;

		while (idx <= n) {
			if(!check[idx]) {
			while (!s.isEmpty() && idx != s.peek()) {
				int a = s.pop();
				tmp.push(a);
				check[a] = !check[a];
			}
			if (!s.isEmpty() && idx == s.peek()) {
				s.pop();
				idx++;
			}
			}
			else {
				if(!tmp.isEmpty()) {
					if(idx != tmp.peek()) {
					poss = false;
					break;
					}
					else {
						tmp.pop();
						idx++;
					}
				}
			}

		}
		if(poss) {
			System.out.println("Nice");
		}
		else {
			System.out.println("Sad");
		}
	}
}