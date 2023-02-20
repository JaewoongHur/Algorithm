import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			char[][] arr = new char[5][16];
			for (int j = 0; j < 5; j++) {
				String s = br.readLine();
				for (int k = 0; k < s.length(); k++) {
					arr[j][k] = s.charAt(k);
				}
				for (int k = s.length(); k < 16; k++) {
					arr[j][k] = '-';
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < 16; j++) {
				for (int k = 0; k < 5; k++) {
					if (arr[k][j] == '-') {
						continue;
					} else {
						sb = sb.append(arr[k][j]);
					}
				}
			}
			System.out.println("#" + i + " " + sb.toString());
		}
	}
}