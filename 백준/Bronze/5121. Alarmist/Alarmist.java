import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());

			double[] arr = new double[n];

			for (int i = 0; i < n; i++) {
				arr[i] = Double.parseDouble(st.nextToken());
			}

			int min = Integer.MAX_VALUE;
			int max = 0;

			for (int i = 0; i < n - w + 1; i++) {
				int s = 0;
				for (int j = 0; j < w; j++) {
					s += arr[i + j];
				}
				
				int x = s/w;				
				
				max = Math.max(max, x);
				min = Math.min(min, x);
			}

			sb.append("Data Set ").append(tc).append(":").append("\n").append(max - min).append('\n').append('\n');
		}
		System.out.println(sb);
	}
}