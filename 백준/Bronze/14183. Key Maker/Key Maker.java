import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();
			if (s.equals("0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			int[] key = new int[m];

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < m; i++) {
				key[i] = Integer.parseInt(st.nextToken());
			}

			int ans = 0;
			
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				for (int j = 0; j < m; j++) {
					int a = Integer.parseInt(st.nextToken());
					if (key[j] < a) {
						ans++;
						break;
					}
				}
			}
			ans = n - ans;
			System.out.println(ans);
		}
	}
}
