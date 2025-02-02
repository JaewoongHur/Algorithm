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

			if (s.equals("#")) {
				break;
			}

			st = new StringTokenizer(s);

			int a = Integer.parseInt(st.nextToken());

			int m = st.countTokens();

			boolean pass = true;

			boolean[] check = new boolean[21];

			check[a] = true;

			for (int i = 0; i < m; i++) {
				String b = st.nextToken();

				if (b.charAt(0) == 'U') {
					a += b.charAt(1) - '0';
				} else if (b.charAt(0) == 'D') {
					a -= b.charAt(1) - '0';
				}

				if (a < 1 || a > 20 || check[a]) {
					pass = false;
					break;
				}
				
				check[a] = true;

			}

			if (!pass) {
				System.out.println("illegal");
				continue;
			}

			int cnt = 0;
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=1;i<=20;i++) {
				if(!check[i]) {
					cnt++;
					sb.append(i).append(' ');
				}
			}
			
			if(cnt == 0) {
				System.out.println("none");
			}else {
				System.out.println(sb.toString());
			}
		}
	}
}