import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];

		boolean isPossible = false;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			if (arr[i] >= k) {
				isPossible = true;
			}
		}

		int sum = 1;

		if (!isPossible) {
			System.out.println("-1");
		} else {
			for (int i = 0; i < n; i++) {
				if (arr[i] < k) {
					sum += arr[i];
				} else {
					sum += k - 1;
				}
			}
			System.out.println(sum);
		}
	}
}