import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int cost = 0;
		int tmp = 0;
		out: while (true) {
			for (int i = 0; i < n; i++) {
				if (arr[i] == 0) {
					continue;
				} else {
					if (i + 1 < n && arr[i + 1] == 0) {
						tmp = arr[i];
						arr[i] = 0;
						cost += tmp * 3;
						continue out;
					} else if (i + 1 < n && arr[i + 1] != 0) {
						if (i + 2 < n && arr[i + 2] == 0) {
							tmp = Math.min(arr[i], arr[i + 1]);
							arr[i] -= tmp;
							arr[i + 1] -= tmp;
							cost += tmp * 5;
						} else if (i + 2 < n && arr[i + 2] != 0) {
							if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
								int gap = arr[i + 1] - arr[i + 2];
								gap = Math.min(arr[i], gap);
								arr[i] -= gap;
								arr[i + 1] -= gap;
								cost += gap * 5;
								tmp = Math.min(Math.min(arr[i], arr[i + 1]), arr[i + 2]);
								arr[i] -= tmp;
								arr[i + 1] -= tmp;
								arr[i + 2] -= tmp;
								cost += tmp * 7;
								continue out;
							} else {
								tmp = Math.min(Math.min(arr[i], arr[i + 1]), arr[i + 2]);
								arr[i] -= tmp;
								arr[i + 1] -= tmp;
								arr[i + 2] -= tmp;
								cost += tmp * 7;
								continue out;
							}
						} else if (i == n - 2) {
							tmp = Math.min(arr[i], arr[i + 1]);
							arr[i] -= tmp;
							arr[i + 1] -= tmp;
							cost += tmp * 5;
						}
					} else if (i == n - 1) {
						tmp = arr[i];
						arr[i] = 0;
						cost += tmp * 3;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				if (arr[i] != 0) {
					continue out;
				}
			}
			break;
		}
		System.out.println(cost);
	}
}