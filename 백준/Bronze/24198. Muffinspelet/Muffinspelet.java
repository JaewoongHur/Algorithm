import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int k = n;

		int a = 0;
		int b = 0;

		while (k > 0) {

			int x = k - k / 2;
			b += x;
			k -= x;

			if (k == 0) {
				break;
			}

			x = k - k / 2;
			a += x;
			k -= x;
		}
		
		System.out.println(a + " " + b);
	}
}