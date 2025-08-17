import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] total = new int[n + 1];
		int[] time = new int[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			if (s.equals("START")) {
				time[a] = H * 60 + M;
			} else {
				total[a] += H * 60 + M - time[a];
			}
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(total[i] / 60 + " " +  total[i] % 60);
		}

	}
}