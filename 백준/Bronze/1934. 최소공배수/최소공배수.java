import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a < b) {
				int tmp = b;
				b = a;
				a = tmp;
			}
			int c = a;
			int d = b;
			while (c % d != 0 && c != 0 && d != 0) {
				int tmp = c % d;
				c = d;
				d = tmp;
			}

			int result = a * b / d;
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}
}