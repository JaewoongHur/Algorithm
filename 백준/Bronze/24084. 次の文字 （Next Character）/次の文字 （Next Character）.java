import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String s = br.readLine();

		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i + 1) == 'J') {
				System.out.println(s.charAt(i));
			}
		}
	}
}