import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 3; i++) {
			String s = br.readLine();
			int max = 1;
			int idx = 1;
			for (int j = 0; j < 7; j++) {
				if (s.charAt(j) != s.charAt(j + 1)) {
					idx = 1;
				} else {
					idx++;
				}
				max = Math.max(idx, max);
			}
			System.out.println(max);
		}
	}
}