import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int ans = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				int a = Integer.parseInt(st.nextToken());
				
				ans += a/k;
			}
			
			System.out.println(ans);
		}
	}
}