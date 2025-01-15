import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayDeque<Integer> dq = new ArrayDeque<>();

		for (int i = 1; i <= n; i++) {
			dq.addLast(i);
		}

		StringBuilder sb = new StringBuilder();

		while (dq.size() > 1) {
			int a = dq.removeFirst();
			sb.append(a).append(' ');
			
			a = dq.removeFirst();
			
			dq.addLast(a);
		}
		
		sb.append(dq.removeFirst());
		
		System.out.println(sb);
	}
}