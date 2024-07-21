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

			if (s.equals("0 0")) {
				break;
			}
			
			st = new StringTokenizer(s);
			
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			
			
			double x = (a*a + b*b)*(Math.PI)/100;
			
			int ans = (int) Math.ceil(x);
			
			System.out.println("The property will be flooded in hour " + ans + ".");
		}
	}
}