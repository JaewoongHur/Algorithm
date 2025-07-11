import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int S = 0;

			for (int i = 0; i < n; i++) {
				S += arr[i] * (int) Math.pow(x, i);
			}

			if (S > y) {
				System.out.println("Inside");
			} else if (S == y) {
				System.out.println("On");
			} else {
				System.out.println("Outside");
			}

		}
	}
}
