import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			int n = Integer.parseInt(s);

			st = new StringTokenizer(br.readLine());

			int a = 0;
			int b = 0;

			for (int i = 0; i < n; i++) {
				int k = Integer.parseInt(st.nextToken());
				if (k == 0) {
					a++;
				} else {
					b++;
				}
			}
			sb.append("Mary won ").append(a).append(" times and John won ").append(b).append(" times").append('\n');
		}
		System.out.println(sb);
	}
}