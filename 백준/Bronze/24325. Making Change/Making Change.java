import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");

			double a = Double.parseDouble(s[0]);
			double b = Double.parseDouble(s[1]);

			double c = b - a;

			int v = (int) c / 50;
			c -= v * 50;
			int w = (int) c / 20;
			c -= w * 20;
			int x = (int) c / 10;
			c -= x * 10;
			int y = (int) c / 5;
			c -= y * 5;
			int z = (int) c / 1;
				
			sb.append(v).append("-$50, ").append(w).append("-$20, ").append(x).append("-$10, ").append(y).append("-$5, ").append(z).append("-$1").append('\n');
		}
		System.out.println(sb);
	}
}
