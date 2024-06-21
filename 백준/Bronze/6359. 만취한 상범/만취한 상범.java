import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {

			int n = Integer.parseInt(br.readLine());

			boolean[] arr = new boolean[n + 1];

			for (int i = 2; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j % i == 0) {
						arr[j] = !arr[j];
					}
				}
			}
			
			int ans = 0;
			
			for(int i=1;i<=n;i++) {
				if(!arr[i]) {
					ans++;
				}
			}
			
			System.out.println(ans);
		}
	}
}