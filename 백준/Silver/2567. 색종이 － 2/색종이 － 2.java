import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[][] A = new int[102][102];
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					A[j + r + 1][k + c + 1] = 1;
				}
			}
		}
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		int cnt = 0;
		for (int i = 0; i < 102; i++) {
			for (int j = 0; j < 102; j++) {
				if (A[i][j] == 1) {
					for (int k = 0; k < 4; k++) {
						int nr = i + dr[k];
						int nc = j + dc[k];
						if (nr >= 0 && nr < 102 && nc >= 0 && nc < 102 && A[nr][nc] == 0) {
							cnt++;
						}
					}
				}
			}
		}
		bw.write(String.valueOf(cnt));
		br.close();
		bw.close();
	}
}