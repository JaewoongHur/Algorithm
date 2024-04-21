import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		String s = st.nextToken();
		int m = s.length();
		sb.append(s.charAt(0));

		for (int i = 1; i < n; i++) {
			s = st.nextToken();
			int k = s.length();

			if (m > k) {
				sb.append(' ');
				m = k;
				continue;
			}

			sb.append(s.charAt(m-1));
			m = k;
		}

		System.out.println(sb);
	}
}