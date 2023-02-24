import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][3];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = i + 1;
		}
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				if (a[0] * b[1] > b[0] * a[1]) {
					return 1;
				} else if (a[0] * b[1] == b[0] * a[1]) {
					return a[2] - b[2];
				} else {
					return -1;
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<N;i++) {
			sb.append(arr[i][2]+" "); 
		}
		System.out.println(sb);
	}
}