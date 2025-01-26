import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int k = Integer.parseInt(br.readLine().trim());

		for (int tc = 1; tc <= k; tc++) {
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[][] arr = new int[n + 1][2];

			for (int i = 1; i <= n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 2; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			st = new StringTokenizer(br.readLine());

			int xmin = Integer.MAX_VALUE;
			int xmax = Integer.MIN_VALUE;
			int ymin = Integer.MAX_VALUE;
			int ymax = Integer.MIN_VALUE;

			for (int i = 0; i < m; i++) {
				int a = Integer.parseInt(st.nextToken());
				
				xmin = Math.min(xmin, arr[a][0]);
				xmax = Math.max(xmax, arr[a][0]);
				ymin = Math.min(ymin, arr[a][1]);
				ymax = Math.max(ymax, arr[a][1]);
			}

			int ans = 0;

			for (int i = 1; i <= n; i++) {
				if (arr[i][0] >= xmin && arr[i][0] <= xmax && arr[i][1] >= ymin && arr[i][1] <= ymax) {
					ans++;
				}
			}

			System.out.println("Data Set " + tc + ":");
			System.out.println(ans);
			System.out.println();
		}
	}
}