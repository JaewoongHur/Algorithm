import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i <= 10; i++) {
			char[][] A = new char[8][8];
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < 8; j++) {
				String s = br.readLine();
				for (int k = 0; k < 8; k++) {
					A[j][k] = s.charAt(k);
				}
			}
			int cnt = 0;
			for (int j = 0; j < 8; j++) {
				for (int k = 0; k < 8; k++) {
					if (k + n - 1 < 8 && A[j][k] == A[j][k + n - 1]) {
						int a = 0;
						int c = 0;
						while (a != (n / 2) - 1) {
							a++;
							if (A[j][k + a] != A[j][k + n - 1 - a]) {
								c++;
								break;
							}
						}
						if (c == 0) {
							cnt++;
						}
					}
				}
			}
			for (int j = 0; j < 8; j++) {
				for (int k = 0; k < 8; k++) {
					if (j + n - 1 < 8 && A[j][k] == A[j + n - 1][k]) {
						int a = 0;
						int c = 0;
						while (a != (n / 2) - 1) {
							a++;
							if (A[j + a][k] != A[j + n - 1 - a][k]) {
								c++;
								break;
							}
						}
						if (c == 0) {
							cnt++;
						}
					}
				}
			}
			bw.write("#"+i+" "+cnt);
			bw.newLine();			
		}
		br.close();
		bw.close();
	}
}