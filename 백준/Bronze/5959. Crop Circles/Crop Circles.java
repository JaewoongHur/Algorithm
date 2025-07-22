import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		double[][] arr = new double[n][3];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 3; j++) {
				arr[i][j] = Double.parseDouble(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			int num = 0;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;

				double d = Math.pow((arr[i][0] - arr[j][0]), 2) + Math.pow((arr[i][1] - arr[j][1]), 2);

				if (d <= Math.pow(arr[i][2] + arr[j][2],2)) {
					num++;
				}
			}
			System.out.println(num);
		}

	}
}
