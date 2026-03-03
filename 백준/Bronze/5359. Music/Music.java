import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int[] arr = new int[n];

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			if (m > n) {
				System.out.println(0);
				continue;
			}

			int cnt = 0;
			for (int i = 0; i < n-m+1; i++) {
				int min = Integer.MAX_VALUE;
				int max = 0;
				for(int j=0;j<m;j++) {
					min = Math.min(arr[i+j], min);
					max = Math.max(arr[i+j], max);
				}
				if(max-min<=c) cnt++;
			}
			System.out.println(cnt);
		}

	}
}
