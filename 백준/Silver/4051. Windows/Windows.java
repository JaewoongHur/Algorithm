import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		StringBuilder sb = new StringBuilder();

		int tc = 1;
		
		while (true) {
			s = br.readLine();
			if (s.equals("0")) {
				break;
			}
			
			int n = Integer.parseInt(s);
			
			int[][] window = new int[n + 1][4];

			for (int i = 1; i <= n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 4; j++) {
					window[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			sb.append("Desktop ").append(tc).append(':').append('\n');
			
			int m = Integer.parseInt(br.readLine());

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				int idx = 0;

				for (int j = n; j >= 1; j--) {
					if (a >= window[j][0] && a <= window[j][0] + window[j][3]-1 && b >= window[j][1]
							&& b <= window[j][1] + window[j][2]-1) {
						idx = j;
						break;
					}
				}
				
				if(idx == 0) {
					sb.append("background\n");
				}else {
					sb.append("window ").append(idx).append('\n');
				}
			}
			
			tc++;
		}
		System.out.println(sb);
	}
}