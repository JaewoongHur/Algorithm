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
		int[][] A;
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			A = new int[N][N];			// NxN 배열
			for (int j = 0; j < N; j++) {
				String s = br.readLine();
				for (int k = 0; k < N; k++) {
					A[j][k] = s.charAt(k) - '0';	// 문자열 받기
				}
			}
			int sum = 0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {	// 다이아몬드 형태 값 받기
					if (Math.abs(N / 2 - j) <= k && k <= N - 1 - Math.abs(N / 2 - j)) {
						sum += A[j][k];			// 누적 합
					}
				}
			}
			bw.write("#" + i + " " + sum);	// 버퍼에 저장
			bw.newLine();
		}
		br.close();		
		bw.close();			// 버퍼 닫으면서 한꺼번에 출력
	}
}