import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb = new StringBuilder();
		
		for (int tc = 0; tc < T; tc++) {
			br.readLine();
			int n = Integer.parseInt(br.readLine().trim());
			st = new StringTokenizer(br.readLine().trim());

			int m = st.countTokens();

			boolean[] check = new boolean[n + 1];

			for (int i = 0; i < m; i++) {
				int a = Integer.parseInt(st.nextToken());

				if (check[a]) {
					continue;
				}

				sb.append(a).append(' ');
				check[a] = true;
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		
	}
}
