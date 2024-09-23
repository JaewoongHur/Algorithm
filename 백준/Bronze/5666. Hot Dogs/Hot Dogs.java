import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s == null) {
				break;
			}

			st = new StringTokenizer(s);

			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());

			double c = a / b;
			
			String ans = String.format("%.2f", c);
			System.out.println(ans);
		}
	}
}