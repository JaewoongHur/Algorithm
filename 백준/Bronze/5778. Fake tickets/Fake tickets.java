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

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[] arr = new int[n + 1];

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < m; i++) {
				int k = Integer.parseInt(st.nextToken());
				arr[k]++;
			}
			
			int ans = 0;
			
			for(int i=1;i<=n;i++) {
				if(arr[i]>=2) {
					ans ++;
				}
			}
			System.out.println(ans);
		}
	}
}