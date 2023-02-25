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
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			int cnt = 0;
			int n = Integer.parseInt(br.readLine());
			for (int tc2 = 0; tc2 < n; tc2++) {
				st = new StringTokenizer(br.readLine());
				int cx = Integer.parseInt(st.nextToken());
				int cy = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());

				int b1 = (x1 - cx) * (x1 - cx) + (y1 - cy) * (y1 - cy);
				int b2 = (x2 - cx) * (x2 - cx) + (y2 - cy) * (y2 - cy);

				if (b1 < r * r && b2 > r * r) {
					cnt++;
				} else if (b1 > r * r && b2 < r * r) {
					cnt++;
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.print(sb);
	}
}