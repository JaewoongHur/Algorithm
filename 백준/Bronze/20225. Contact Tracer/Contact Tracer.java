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

			if (s.equals("0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());

			boolean[] check = new boolean[n + 1];

			check[p] = true;

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				if (check[a] || check[b]) {
					check[a] = true;
					check[b] = true;
				}
			}
			
			int num = 0;
			
			for(int i=1;i<=n;i++) {
				if(check[i]) {
					num++;
				}
			}
			System.out.println(num);
		}

	}
}
