import java.util.StringTokenizer;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[][] arr;
		for (int i = 1; i <= 10; i++) { // 테스트 케이스 10개
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			for (int j = 0; j < N; j++) { // 행렬 100x100
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			int cnt = 0; // 교착상태 카운트
			int findS = 0; // N극 아래에 있는 S극 탐색
			for (int k = 0; k < N; k++) { // 열 우선 탐색
				findS = 0; // 다음 열 넘어와서 값 초기화
				for (int j = 0; j < N; j++) {
					if (arr[j][k] == 1) { // N극 발견
						findS = 1; // findS 값 부여
					}
					if (findS == 1 && arr[j][k] == 2) { // N극 발견 이후 S극 발견했을 시
						findS = 0; // findS 초기화
						cnt++; // 교착상태로 카운트
					}

				}
			}
			bw.write("#" + i + " " + cnt);
			bw.newLine();
			bw.flush();
		}
	}
}