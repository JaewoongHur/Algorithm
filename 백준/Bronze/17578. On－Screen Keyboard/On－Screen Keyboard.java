import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
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

			HashMap<Character, int[]> map = new HashMap<>();

			for (int i = 0; i < n; i++) {
				String a = br.readLine();
				for (int j = 0; j < m; j++) {
					map.put(a.charAt(j), new int[] { i, j });
				}
			}

			String T = br.readLine();

			int ans = 0;

			int r = 0;
			int c = 0;

			for (int i = 0; i < T.length(); i++) {
				int nR = map.get(T.charAt(i))[0];
				int nC = map.get(T.charAt(i))[1];

				ans += Math.abs(nR - r) + Math.abs(nC - c) + 1;
				r = nR; c = nC;
			}
			System.out.println(ans);
		}
	}
}