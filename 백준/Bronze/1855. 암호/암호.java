import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int c = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int n = s.length();

		int r = n / c;

		char[][] arr = new char[r][c];

		int idx = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i % 2 == 0) {
					arr[i][j] = s.charAt(idx);
				} else {
					arr[i][c - j - 1] = s.charAt(idx);
				}
				idx++;
			}
		}

		for (int j = 0; j < c; j++) {
			for (int i = 0; i < r; i++) {
					sb.append(arr[i][j]);
			}
		}
		System.out.println(sb);
	}
}