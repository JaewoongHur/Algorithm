import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int ex = Integer.parseInt(st.nextToken());

			String s = st.nextToken();

			for (int i = 0; i < ex; i++) {
				String el = st.nextToken();
				int idx = 1;
				for (int j = 0; j < el.length(); j++) {
					idx = el.charAt(j) == '0' ? idx*2 : idx*2+1;
					
					if(s.charAt(idx-1)=='*') {
						continue;
					}
					else {
						sb.append(s.charAt(idx-1));
						idx=1;
					}
				}
				sb.append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}