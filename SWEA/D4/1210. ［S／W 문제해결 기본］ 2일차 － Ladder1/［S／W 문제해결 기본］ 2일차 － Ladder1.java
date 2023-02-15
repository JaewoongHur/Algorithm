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
		StringTokenizer st;
		for (int i = 1; i <= 10; i++) {
			int T = Integer.parseInt(br.readLine());
			int[][] A = new int[100][100];
			int d = 0;
			for (int j = 0; j < 100; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < 100; k++) {
					A[j][k] = Integer.parseInt(st.nextToken());
					if (A[j][k] == 2) {
						d = k;
					}
				}
			}
			int a = 99;
			while (a != 0) {
				if (d < 99 && A[a][d + 1] == 1) {
					A[a][d] = 0;
					d++;
				} else if (d > 0 && A[a][d - 1] == 1) {
					A[a][d] = 0;
					d--;
				} else {
					A[a][d] = 0;
					a--;
				}
			}
			bw.write("#" + T + " " + d);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}