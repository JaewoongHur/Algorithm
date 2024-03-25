import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		int n = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= n; tc++) {
			int x = Integer.parseInt(br.readLine());

			int min = Integer.MAX_VALUE;

			for (int i = 1; i * i <= x; i++) {
				if(x%i !=0) continue;
				int y = x/i;
				for (int j = i; j * j <= y; j++) {
					if(y%j !=0) continue;

					int k = y/j;
					
					if (2 * (i * j + j * k + k * i) < min) {
						min = 2 * (i * j + j * k + k * i);
					}

				}
			}
			System.out.println(min);
		}
	}
}