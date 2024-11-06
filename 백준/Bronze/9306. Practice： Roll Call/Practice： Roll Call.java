import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= n; tc++) {
			String a = br.readLine();
			String b = br.readLine();

			System.out.println("Case " + tc + ": " + b + ", " + a);
		}
	}
}