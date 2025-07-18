import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine().trim());

		HashMap<String, Character> map = new HashMap<>();

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			char c = st.nextToken().charAt(0);
			String s = st.nextToken();

			map.put(s, c);
		}

		String x = br.readLine();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < x.length(); i += 4) {
			String a = x.substring(i, i + 4);

			if (map.containsKey(a)) {
				sb.append(map.get(a));
			} else {
				sb.append("?");
			}
		}
		System.out.println(sb.toString());
	}
}
