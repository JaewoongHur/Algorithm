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
			sb.append("Data Set ").append(tc).append(":").append("\n");
			
			int n = Integer.parseInt(br.readLine());

			int[][] arr = new int[n][3];

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 3; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int max = 0;

			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					int x = (arr[i][0] - arr[j][0]) * (arr[i][0] - arr[j][0])
							+ (arr[i][1] - arr[j][1]) * (arr[i][1] - arr[j][1])
							+ (arr[i][2] - arr[j][2]) * (arr[i][2] - arr[j][2]);
					max = Math.max(max, x);
				}
			}
			
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					int x = (arr[i][0] - arr[j][0]) * (arr[i][0] - arr[j][0])
							+ (arr[i][1] - arr[j][1]) * (arr[i][1] - arr[j][1])
							+ (arr[i][2] - arr[j][2]) * (arr[i][2] - arr[j][2]);
					if(max == x) {
						sb.append(i+1).append(' ').append(j+1).append('\n');
					}
				}
			}
		}
		System.out.println(sb);
	}
}