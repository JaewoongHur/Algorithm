import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String word = br.readLine();
		int n = Integer.parseInt(br.readLine());

		int ans = 0;

		int m = word.length();

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = st.nextToken();

			if (s.length() < m) continue;

			for (int j = 0; j < s.length() - m + 1; j++) {
				if(s.substring(j,j+m).equals(word)) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}