import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int[] arr = new int[4];

		boolean[] check = new boolean[5];

		int cnt = 0;

		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] != 0) {
				check[arr[i]] = true;
				cnt++;
			}
		}

		if (cnt == 4) {
			System.out.println(arr[0] + " " + arr[1]);
		} else if (cnt == 3) {
			for (int i = 0; i < 4; i++) {
				if (arr[i] == 0) {
					System.out.print((i + 1) + " ");
				}
			}

			for (int i = 1; i <= 4; i++) {
				if (!check[i]) {
					System.out.print(i);
				}
			}
		} else {
			for (int i = 1; i <= 4; i++) {
				if (!check[i]) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
