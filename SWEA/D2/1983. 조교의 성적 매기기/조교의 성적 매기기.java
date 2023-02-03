import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= T; i++) {
			int[] arr;
			int[] arr2;
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			String[] scores = { "D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+" };
			arr = new int[N];
			arr2 = new int[N];
			int m = N / 10;
			int p = 0;
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				arr[j] = (Integer.parseInt(st.nextToken())*35+Integer.parseInt(st.nextToken())* 45
						+ Integer.parseInt(st.nextToken())*20);
				arr2[j] = arr[j];
			}

			Arrays.sort(arr2);
			for (int j = 0; j < N; j++) {
				if (arr[K - 1] == arr2[j]) {
					p = j;
				}
			}
			bw.write("#" + i + " " + scores[p / m]);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
