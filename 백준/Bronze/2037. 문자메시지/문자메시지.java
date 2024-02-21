import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int p = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());

		String s = br.readLine();

		int ans = 0;

		int[] dial = new int[] { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9 };

		for (int i = 0; i < s.length(); i++) {

			char a = s.charAt(i);

			if (a == 'A' || a == 'D' || a == 'G' || a == 'J' || a == 'M' || a == 'P' || a == 'T' || a == 'W') {
				ans += p;
			} else if (a == 'B' || a == 'E' || a == 'H' || a == 'K' || a == 'N' || a == 'Q' || a == 'U' || a == 'X') {
				ans += 2 * p;
			} else if (a == 'C' || a == 'F' || a == 'I' || a == 'L' || a == 'O' || a == 'R' || a == 'V' || a == 'Y') {
				ans += 3 * p;
			} else if (a == 'S' || a == 'Z') {
				ans += 4 * p;
			} else if (a == ' ') {
				ans += p;
				continue;
			}

			if (i - 1 >= 0 && s.charAt(i - 1) == ' ')
				continue;

			if (i - 1 >= 0 && dial[s.charAt(i - 1) - 'A'] == dial[a - 'A']) {
				ans += w;
			}

		}
		System.out.println(ans);
	}
}