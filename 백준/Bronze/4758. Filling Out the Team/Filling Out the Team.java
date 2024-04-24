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

			if (s.equals("0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			double a = Double.parseDouble(st.nextToken());

			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			boolean pass = true;

			if (a <= 4.5 && b >= 150 && c >= 200) {
				pass = false;
				System.out.print("Wide Receiver ");
			}
			if (a <= 6.0 && b >= 300 && c >= 500) {
				pass = false;
				System.out.print("Lineman ");
			}
			if (a <= 5.0 && b >= 200 && c >= 300) {
				pass = false;
				System.out.print("Quarterback ");
			}

			if (pass) {
				System.out.print("No positions");
			}
			System.out.println();
		}
	}
}