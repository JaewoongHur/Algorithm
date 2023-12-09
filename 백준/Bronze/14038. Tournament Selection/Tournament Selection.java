import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int win = 0;

		for (int i = 0; i < 6; i++) {
			String s = br.readLine();

			if (s.equals("W")) {
				win++;
			}
		}

		if (win == 5 || win == 6) {
			System.out.println(1);
		} else if (win == 3 || win == 4) {
			System.out.println(2);
		} else if (win == 1 || win == 2) {
			System.out.println(3);
		} else {
			System.out.println(-1);
		}

	}
}