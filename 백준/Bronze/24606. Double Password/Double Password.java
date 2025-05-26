import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();

		int ans = 1;

		for (int i = 0; i < 4; i++) {
			if (a.charAt(i) != b.charAt(i)) {
				ans *= 2;
			}

		}
		System.out.println(ans);
	}
}