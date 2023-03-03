import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int max, min, N;
	static int[] arr;
	static int[] op;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		op = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		operation(0, arr[0]);
		System.out.println(max);
		System.out.println(min);
	}

	static void operation(int d, int result) {
		if (d == N - 1) {
			max = Math.max(max, result);
			min = Math.min(min, result);
			return;
		}

		for (int i = 0; i < 4; i++) {
			if (op[i] != 0) {
				if (i == 0) {
					result += arr[d + 1];
				} else if (i == 1) {
					result -= arr[d + 1];
				} else if (i == 2) {
					result *= arr[d + 1];
				} else {
					result /= arr[d + 1];
				}
				op[i]--;
			}
			else {
				continue;
			}
			operation(d + 1, result);	
			if (i == 0) {
				result -= arr[d + 1];
			} else if (i == 1) {
				result += arr[d + 1];
			} else if (i == 2) {
				result /= arr[d + 1];
			} else {
				result *= arr[d + 1];
			}
			op[i]++;
		}

	}


}