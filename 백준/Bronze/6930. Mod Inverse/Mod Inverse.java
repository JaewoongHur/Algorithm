import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int n = 0;

		for (int i = 1; i < m; i++) {
			if ((x * i) % m == 1) {
				n = i;
			}
		}

		if (n == 0) {
			System.out.println("No such integer exists.");
		} else {
			System.out.println(n);
		}
	}
}