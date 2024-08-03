import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		while (true) {
			if (arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5) {
				break;
			}

			int tmp = 0;

			if (arr[0] > arr[1]) {
				tmp = arr[1];

				arr[1] = arr[0];
				arr[0] = tmp;
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
			}

			if (arr[1] > arr[2]) {
				tmp = arr[2];

				arr[2] = arr[1];
				arr[1] = tmp;
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
			}

			if (arr[2] > arr[3]) {
				tmp = arr[3];

				arr[3] = arr[2];
				arr[2] = tmp;
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
			}

			if (arr[3] > arr[4]) {
				tmp = arr[4];

				arr[4] = arr[3];
				arr[3] = tmp;
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
			}
		}
	}
}