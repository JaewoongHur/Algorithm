import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int a = 0;
		int b = 0;

		if (s.length() == 4) {
			a = Integer.parseInt(s.substring(0, 2));
			b = Integer.parseInt(s.substring(2, 4));
		} else if (s.length() == 3) {
			a = Integer.parseInt(s.substring(0, 1));
			b = Integer.parseInt(s.substring(1, 3));
		} else if (s.length() == 2) {
			a = 0;
			b = Integer.parseInt(s.substring(0, 2));
		}

		int t = a * 60 + b;

		String[] country = new String[] { "Ottawa", "Victoria", "Edmonton", "Winnipeg", "Toronto", "Halifax",
				"St. John's" };
		int[] lag = new int[] { 0, -180, -120, -60, 0, 60, 90 };

		for (int i = 0; i < 7; i++) {
			int k = (t + lag[i]) % 1440;
			if (k < 0)
				k += 1440;

			int nt = k / 60 * 100 + k % 60;

			System.out.println(nt + " in " + country[i]);
		}
	}
}