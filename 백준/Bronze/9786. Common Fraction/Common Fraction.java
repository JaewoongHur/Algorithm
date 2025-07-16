import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine().trim());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int g = gcd(a,b);
			
			System.out.println((a/g) + " " + (b/g));
		}

	}

	private static int gcd(int a, int b) {
		int r = -1;

		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}

		return a;
	}
}
