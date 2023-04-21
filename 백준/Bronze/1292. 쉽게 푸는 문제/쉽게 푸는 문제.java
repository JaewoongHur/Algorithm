import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[1001];

		arr[0] = 0;

		int idx = 1;
		int cnt = 0;

		for (int i = 1; i < 1001; i++) {
			arr[i] = arr[i - 1] + idx;

			cnt++;
			if (idx == cnt) {
				idx++;
				cnt = 0;
			}
		}

		String[] s = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);

		System.out.println(arr[B] - arr[A-1]);

	}
}