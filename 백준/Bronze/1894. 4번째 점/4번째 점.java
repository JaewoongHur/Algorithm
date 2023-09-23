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

			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());

			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());

			double x3 = Double.parseDouble(st.nextToken());
			double y3 = Double.parseDouble(st.nextToken());

			double x4 = Double.parseDouble(st.nextToken());
			double y4 = Double.parseDouble(st.nextToken());

			double x5 = 0.0d;
			double y5 = 0.0d;

			if (x1 == x3 && y1 == y3) {
				x5 = x2 + x4 - x1;
				y5 = y2 + y4 - y1;
			}
			if (x2 == x3 && y2 == y3) {
				x5 = x1 + x4 - x2;
				y5 = y1 + y4 - y2;
			}
			if (x1 == x4 && y1 == y4) {
				x5 = x2 + x3 - x1;
				y5 = y2 + y3 - y1;
			}
			if (x2 == x4 && y2 == y4) {
				x5 = x1 + x3 - x2;
				y5 = y1 + y3 - y2;
			}
			System.out.printf("%.3f", x5);
			System.out.print(" ");
			System.out.printf("%.3f", y5);
			System.out.print("\n");
		}
	}
}