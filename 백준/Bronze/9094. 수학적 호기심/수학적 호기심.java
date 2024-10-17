import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int ans = 0;
			
			for (int a = 1; a < n - 1; a++) {
				for (int b = a + 1; b < n; b++) {
					if((a*a+b*b+m)%(a*b) == 0) {
						ans++;
					}				
				}
			}
			
			System.out.println(ans);
		}
	}
}