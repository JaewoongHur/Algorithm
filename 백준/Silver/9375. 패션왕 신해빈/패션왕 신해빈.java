import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int tc2 = 0; tc2 < n; tc2++) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				s = st.nextToken();
				if (map.get(s) == null) {
					map.put(s, 1);
				} else {
					map.put(s, map.get(s) + 1);
				}
			}
			int S = 1;
			for(Integer x : map.values()) {
				S = S *(x+1);
			}
			S--;
			sb.append(S+"\n");
		}
		System.out.println(sb);
	}
}