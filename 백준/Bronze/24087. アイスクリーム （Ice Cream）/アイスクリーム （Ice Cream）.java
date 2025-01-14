import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int s = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		int t = 250;

		if (s <= a) {
			System.out.println(t);
		} else {
			int r = (s - a) / b;

			if ((s - a) % b == 0) {
				t += r * 100;
			} else {
				t += (r + 1) * 100;
			}

			System.out.println(t);
		}
	}
}