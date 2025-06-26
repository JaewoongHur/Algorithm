import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		double t = n;

		double b = 0;

		for (int i = 0; i < n; i++) {
			double a = Double.parseDouble(st.nextToken());
			if (a == -1) {
				t--;
				continue;
			}

			b += a;
		}
		
		System.out.println(b/t);

	}
}