import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Stack<int[]> s = new Stack<>();

		long ans = 0;
		s.push(new int[] { Integer.parseInt(br.readLine()), 1 });
		for (int i = 1; i < n; i++) {
			int a = Integer.parseInt(br.readLine());

			if (!s.isEmpty() && s.peek()[0] < a) {
				int b = 0;
				while (!s.isEmpty() && s.peek()[0] < a) {
					b = s.pop()[1];
					ans += b;
				}
				if (!s.isEmpty() && s.peek()[0] > a) {
					ans++;
				} else if (!s.isEmpty() && s.peek()[0] == a) {
					b = s.pop()[1];
					if (!s.isEmpty() && s.peek()[0] > a) {
						ans++;
					}
					s.push(new int[] { a, b + 1 });
					ans += b;
					continue;
				}
				s.push(new int[] { a, 1 });
				continue;
			}
			if (!s.isEmpty() && s.peek()[0] > a) {
				s.push(new int[] { a, 1 });
				ans++;
				continue;
			}
			if (!s.isEmpty() && s.peek()[0] == a) {
				int b = s.pop()[1];
				if (!s.isEmpty() && s.peek()[0] > a) {
					ans++;
				}
				s.push(new int[] { a, b + 1 });
				ans += b;

				continue;
			}

		}
		System.out.println(ans);
	}
}