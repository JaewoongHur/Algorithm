import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());

			int l = Integer.parseInt(st.nextToken());

			int r = Integer.parseInt(st.nextToken());

			if (a == 1) {
				for (int j = l - 1; j < r; j++) {
					arr[j] = arr[j] * arr[j] % 2010;
				}
				continue;
			}
			int sum = 0;
			if (a == 2) {
				for (int j = l - 1; j < r; j++) {
					sum += arr[j];
				}
			}
			sb.append(sum).append('\n');
		}

		System.out.println(sb);
	}
}