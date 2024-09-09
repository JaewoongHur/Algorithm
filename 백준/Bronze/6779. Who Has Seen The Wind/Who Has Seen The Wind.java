import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int h = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int t = -1;

		for (int i = 1; i <= m; i++) {
			if (-6 * i * i * i * i + h * i * i * i + 2 * i * i + i <= 0) {
				t = i;
				break;
			}
		}

		if (t == -1) {
			System.out.println("The balloon does not touch ground in the given time.");
		} else {
			System.out.println("The balloon first touches ground at hour: " + t);
		}
	}
}