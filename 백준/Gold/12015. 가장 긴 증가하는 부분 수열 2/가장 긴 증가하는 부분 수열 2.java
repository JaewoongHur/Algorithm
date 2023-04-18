import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		int[] LIS = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		LIS[0] = arr[0];
		int len = 1;

		for (int i = 1; i < N; i++) {
			int a = arr[i];
			if (LIS[len - 1] < a) {
				len++;
				LIS[len - 1] = a;
			} else {
				int left = 0;
				int right = len;

				while (left < right) {
					int mid = (left + right)/2;
				
					if (LIS[mid] < a) {
						left = mid + 1;
					}
					else {
						right = mid;
					}
				}
				LIS[left] = a;
			}
		}
		System.out.println(len);

	}
}