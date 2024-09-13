import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			String a = st.nextToken();
			String b = st.nextToken();
			String c = st.nextToken();

			int x = 0;

			out: for (int i = 2; i <= 16; i++) {
				
				for(int j=0;j<a.length();j++) {
					if(a.charAt(j)-'0' >=i) {
						continue out;
					}
				}
				
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j)-'0' >=i) {
						continue out;
					}
				}
				
				for(int j=0;j<c.length();j++) {
					if(c.charAt(j)-'0' >=i) {
						continue out;
					}
				}
				
				
				int left1 = 0;
				int left2 = 0;
				int right = 0;

				for (int j = 0; j < a.length(); j++) {
					left1 += ((int) Math.pow(i, a.length() - j - 1)) * (a.charAt(j) - '0');
				}

				for (int j = 0; j < b.length(); j++) {
					left2 += ((int) Math.pow(i, b.length() - j - 1)) * (b.charAt(j) - '0');
				}

				for (int j = 0; j < c.length(); j++) {
					right += ((int) Math.pow(i, c.length() - j - 1)) * (c.charAt(j) - '0');
				}


				if (left1 * left2 == right) {
					x = i;
					break;
				}
			}
			System.out.println(x);
		}
	}
}