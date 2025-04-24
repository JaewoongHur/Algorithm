import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int score = 0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();

			for (int j = 0; j < 13; j++) {
				if (s.charAt(j) == 'A') {
					score += 4;
				} else if (s.charAt(j) == 'K') {
					score += 3;
				} else if (s.charAt(j) == 'Q') {
					score += 2;
				} else if (s.charAt(j) == 'J') {
					score += 1;
				}
			}
		}
		System.out.println(score);
	}
}