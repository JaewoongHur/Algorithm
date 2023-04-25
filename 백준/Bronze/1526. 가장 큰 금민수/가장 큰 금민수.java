import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		while (true) {
			int a = N;

			boolean check = true;

			while (a > 0) {
				if (a % 10 != 4 && a % 10 != 7) {
					check = false;
					break;
				} else {
					a /= 10;
				}
			}

			if (check) {
				break;
			}
			
			N--;
		}
		System.out.println(N);
	}
}