import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			int n = Integer.parseInt(s);

			int[] arr = new int[n];

			int sum = 0;

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				sum += arr[i];
			}
			Arrays.sort(arr);

			sum = sum - arr[0] - arr[n - 1];
			
			int avg = sum / (n-2);
			System.out.println(avg);
		}

	}
}