import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] A;
		for (int i = 1; i <= T; i++) {
			String s = br.readLine();
			int n = s.length();
			A = new int[n];
			int p = 0; // 괄호 카운트 변수
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == 40) { // '(' 만나면 +1
					p++;
				} else {
					p--; // ')' 만나면 -1
				}
				A[j] = p;
			}
			int pipeSegment = 0;
			for (int j = 0; j < n; j++) {   // 레이저 만나면 절단 후 파이프 갯수 카운트
				if (j < n - 2 && A[j + 1] >= 2 && A[j] + 1 == A[j + 1] && A[j + 1] == A[j + 2] + 1) {
					pipeSegment += A[j + 2];
				}
				if (j >= 1 && j < n - 1 && A[j - 1] == A[j] + 1 && A[j] == A[j + 1] + 1) {
					pipeSegment += 1;			// 파이프 절단 후 남은 파편 1씩 더하기 (다른 파이프)
				}
			}
			bw.write("#" + i + " " + pipeSegment);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}