import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		long[][] arr = new long[N + 1][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		arr[N][0] = arr[0][0];
		arr[N][1] = arr[0][1];

		double area = 0.0d;
		for (int i = 0; i < N; i++) {
			double S = arr[i][0]*arr[i+1][1] - arr[i+1][0]*arr[i][1];
			area += S;
		}
		
		area = Math.abs(0.5*area);
		System.out.printf("%.1f", area);
	}
}