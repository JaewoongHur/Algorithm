import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		outer: for (int i = 1; i <= T; i++) {
			int[][] arr = new int[8][8]; // 체스판 배열 형성
			for (int j = 0; j < 8; j++) {
				String s = br.readLine();
				for (int k = 0; k < 8; k++) {
					arr[j][k] = s.charAt(k); // 입력값 받기
				}
			}

			// 행 탐색
			for (int j = 0; j < 8; j++) { // 행마다 탐색
				int cnt = 0;
				for (int k = 0; k < 8; k++) {
					if (arr[j][k] == 'O') {
						cnt++;
					}
				}
				if (cnt != 1) { // 룩이 같은 행에 있으면 출력 후 다음 테스트 케이스 이동
					System.out.println("#" + i + " no");
					continue outer;
				}
			}

			// 열 탐색
			for (int j = 0; j < 8; j++) { // 열마다 탐색
				int cnt = 0;
				for (int k = 0; k < 8; k++) {
					if (arr[k][j] == 'O') {
						cnt++;
					}
				}
				if (cnt != 1) {
					System.out.println("#" + i + " no");
					continue outer;
				}
			}
			System.out.println("#" + i + " yes");
		}
	}
}