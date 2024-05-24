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
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			boolean[] place = new boolean[b+1];
			
			int ans = 0;
			
			for(int i=0;i<a;i++) {
				int k = Integer.parseInt(br.readLine());
				if(!place[k]) {
					place[k] = true;
				}else {
					ans++;
				}
			}
			sb.append(ans).append('\n');
		}
		System.out.println(sb);
	}
}