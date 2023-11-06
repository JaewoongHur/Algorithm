import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		int idx = 0;
		char m = (char) (l + '0');
		int k = 1;
		out: while (idx < n) {
			String s = String.valueOf(k);

			for (int i = 0; i < s.length(); i++) {
				if (m == s.charAt(i)) {
					k++;
					
					continue out;
				}
			}

			k++;
			idx++;
		}
		System.out.println(k-1);
	}
}