import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int N;
	static int cnt56;
	static int cnt6;

	public static boolean cnt56Check(int[][] arr, int x, int y) {
		return ((arr[x][y] == 6 && arr[x][5 - y] == 5) | (arr[x][y] == 5 && arr[x][5 - y] == 6));
	}

	public static boolean cnt6Check(int[][] arr, int x, int y) {
		return ((arr[x][y] == 6 && !(arr[x][5 - y] == 5)) | (!(arr[x][y] == 5) && arr[x][5 - y] == 6));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		arr = new int[N][6];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 6; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++) {
			int tmp = arr[i][3];
			arr[i][3] = arr[i][4];
			arr[i][4] = tmp;
		}

		int max = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < 6; i++) {
			cnt56 = 0;
			cnt6 = 0;
			x = 0;
			y = i;
			while (x <= N - 1) {
				if (cnt56Check(arr, x, y)) {
					cnt56++;
					if (x == N - 1) {
						break;
					}
					for (int j = 0; j < 6; j++) {
						if (arr[x + 1][j] == arr[x][5 - y]) {
							x++;
							y = j;
							break;
						}
					}
					continue;
				} else if (cnt6Check(arr, x, y)) {
					cnt6++;
					if (x == N - 1) {
						break;
					}
					for (int j = 0; j < 6; j++) {
						if (arr[x + 1][j] == arr[x][5 - y]) {
							x++;
							y = j;
							break;
						}
					}
					continue;
				} else {
					if (x == N - 1) {
						break;
					}
					for (int j = 0; j < 6; j++) {
						if (arr[x + 1][j] == arr[x][5 - y]) {
							x++;
							y = j;
							break;
						}
					}
				}
			}

			int sideSum = 6 * N - 2 * cnt56 - cnt6;
			max = Math.max(sideSum, max);
		}
		System.out.println(max);
	}
}