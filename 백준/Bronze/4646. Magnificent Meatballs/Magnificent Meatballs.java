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

			int sum = 0;

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}

			if (sum % 2 == 1) {
				System.out.println("No equal partitioning.");
				continue;
			}

			boolean pass = true;

			int a = 0;

			for (int i = 0; i < n; i++) {
				a += arr[i];

				if (a == sum / 2) {
					pass = false;
					System.out.println(
							"Sam stops at position " + (i + 1) + " and Ella stops at position " + (i + 2) + ".");
					break;
				}
			}

			if (pass) {
				System.out.println("No equal partitioning.");
			}

		}

	}
}