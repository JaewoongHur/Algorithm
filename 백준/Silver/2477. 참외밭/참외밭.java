import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;

	public static boolean orientalMelon(int x, int a1, int a2, int a3, int a4, int a5, int a6) {

		return arr[x % 6][0] == a1 && arr[(x + 1) % 6][0] == a2 && arr[(x + 2) % 6][0] == a3
				&& arr[(x + 3) % 6][0] == a4 && arr[(x + 4) % 6][0] == a5 && arr[(x + 5) % 6][0] == a6;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int K = Integer.parseInt(br.readLine());

		arr = new int[6][2];
		int[] x = new int[5];
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (j == 0) {
					x[arr[i][0]]++;
				}
			}
		}

		int A = 0;

		for (int i = 0; i < 6; i++) {
			if (orientalMelon(i, 4, 2, 3, 1, 3, 1)) {
				A = arr[i % 6][1] * arr[(i + 1) % 6][1] - arr[(i + 3) % 6][1] * arr[(i + 4) % 6][1];
			}
		}

		for (int i = 0; i < 6; i++) {
			if (orientalMelon(i, 2, 3, 1, 4, 1, 4)) {
				A = arr[i % 6][1] * arr[(i + 1) % 6][1] - arr[(i + 3) % 6][1] * arr[(i + 4) % 6][1];
			}
		}
		for (int i = 0; i < 6; i++) {
			if (orientalMelon(i, 3, 1, 4, 2, 4, 2)) {
				A = arr[i % 6][1] * arr[(i + 1) % 6][1] - arr[(i + 3) % 6][1] * arr[(i + 4) % 6][1];
			}
		}
		for (int i = 0; i < 6; i++) {
			if (orientalMelon(i, 1, 4, 2, 3, 2, 3)) {
				A = arr[i % 6][1] * arr[(i + 1) % 6][1] - arr[(i + 3) % 6][1] * arr[(i + 4) % 6][1];
			}
		}
		System.out.println(A * K);
	}
}