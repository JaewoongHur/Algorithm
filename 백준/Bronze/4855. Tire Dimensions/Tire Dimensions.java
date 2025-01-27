import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while ((s = br.readLine()) != null) {
			st = new StringTokenizer(s);
			
			int m = st.countTokens();
			
			st.nextToken();
			double x = Double.parseDouble(st.nextToken());
			st.nextToken();
			double y = Double.parseDouble(st.nextToken());

			String b = st.nextToken();

			if (m == 7) {
				st.nextToken();
			}

			double r = Double.parseDouble(st.nextToken());

			long ans = (long) Math.round((x * y * 0.001 * 2 + r * 2.54) * Math.PI);

			System.out.println(s + ": " + ans);
		}
	}
}