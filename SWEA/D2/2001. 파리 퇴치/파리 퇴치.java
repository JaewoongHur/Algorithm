import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int[][] arr;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			int max = 0;
			for (int j = 0; j < N - M + 1; j++) {
				for (int k = 0; k < N - M + 1; k++) {
					int sum = 0;
					for (int l = 0; l < M; l++) {
						for (int m = 0; m < M; m++) {
							sum += arr[j + l][k + m];
						}
					}
					max = Math.max(sum, max);
				}
			}
			bw.write("#"+i+" "+max);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}