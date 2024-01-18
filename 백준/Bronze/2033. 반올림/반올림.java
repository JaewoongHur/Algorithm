import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double d = Double.parseDouble(br.readLine());

		double n = 1;

		while (d >= 1) {
			if (d / Math.pow(10, n) < 1) {
				break;
			}

			d = d / Math.pow(10, n);
			d = Math.round(d);
			d = d * Math.pow(10, n);

			n++;
		}

		System.out.println((int) d);

	}
}