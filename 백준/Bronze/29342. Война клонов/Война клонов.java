import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		long e = 0;

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());

			if (a % 2 == 0) {
				e++;
			}
		}

		System.out.println(e * (n - e));

	}
}