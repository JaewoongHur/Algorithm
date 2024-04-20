import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s;

		while (true) {

			s = br.readLine();

			if (s.equals("0.00")) {
				break;
			}

			double a = Double.parseDouble(s);

			int n = 0;

			double c = 0;
			
			double d = 2;
			
			while (c < a) {
				
				c += (1/d);
				
				n++;
				d++;
			}
			sb.append(n).append(" card(s)").append('\n');
		}
		System.out.println(sb);
	}
}