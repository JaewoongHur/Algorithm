import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		String[] ban = new String[] { "i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili" };
		String s = st.nextToken();
		
		sb.append(Character.toUpperCase(s.charAt(0)));

		out: while (st.hasMoreTokens()) {
			s = st.nextToken();
			for (int i = 0; i < ban.length; i++) {
				if (s.equals(ban[i])) {
					continue out;
				}
			}

			sb.append(Character.toUpperCase(s.charAt(0)));
		}

		System.out.println(sb.toString());
	}
}