import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t0 = 0;
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;

		while (true) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a + b <= c || b + c <= a || c + a <= b) {
				break;
			}

			if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
				t1++;
			} else if (a * a + b * b < c * c || b * b + c * c < a * a || c * c + a * a < b * b) {
				t3++;
			} else {
				t2++;
			}
		}
		t0 = t1 + t2 + t3;
		System.out.println(t0 + " " + t1 + " " + t2 + " " + t3);
	}
}