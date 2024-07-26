import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine().trim());

		String s = br.readLine();

		int m = s.length();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			int a = 3 * (i + 1) + n;

			int b = (s.charAt(i) - 'A' - a) % 26;
			
			if(b<0) {
				b += 26;
			}
			
			char c = (char)('A'+b);
			sb.append(c);
		}
		System.out.println(sb);
	}
}