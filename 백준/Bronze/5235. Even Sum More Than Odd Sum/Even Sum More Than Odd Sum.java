import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine());

			int m = Integer.parseInt(st.nextToken());

			int a = 0;
			int b = 0;

			for (int i = 0; i < m; i++) {
				int k = Integer.parseInt(st.nextToken());

				if (k % 2 == 0) {
					a += k;
				} else {
					b += k;
				}
			}
			
			if(a>b) {
				sb.append("EVEN");
			}else if(a<b) {
				sb.append("ODD");
			}else {
				sb.append("TIE");
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}