import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		boolean[] arr = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int k = a;

			while (k <= n) {
				if (!arr[k]) {
					arr[k] = true;
				}

				k += b;
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