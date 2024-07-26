import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		boolean[] check = new boolean[10000];

		int n = Integer.parseInt(s);
		check[n] = true;

		int ans = 0;

		while (true) {

			StringBuilder sb = new StringBuilder();

			String a = s.substring(1, 3);
			int k = Integer.parseInt(a);
			k = k * k;

			ans++;

			if (check[k]) {
				break;
			}

			check[k] = true;

			s = String.valueOf(k);

			if (s.length() < 4) {
				for (int i = 0; i < 4 - s.length(); i++) {
					sb.append('0');
				}
				sb.append(s);
				s = sb.toString();
			}
		}
		System.out.println(ans);
	}
}