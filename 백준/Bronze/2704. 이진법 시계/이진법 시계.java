import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < n; tc++) {
			st = new StringTokenizer(br.readLine(), ":");

			Integer h = Integer.parseInt(st.nextToken());
			Integer m = Integer.parseInt(st.nextToken());
			Integer s = Integer.parseInt(st.nextToken());

			String a = Integer.toBinaryString(h);
			String b = Integer.toBinaryString(m);
			String c = Integer.toBinaryString(s);

			char[][] arr = new char[3][6];

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 6; j++) {
					arr[i][j] = '0';
				}
			}

			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == '1') {
					arr[0][6 - a.length() + i] = '1';
				}
			}

			for (int i = 0; i < b.length(); i++) {
				if (b.charAt(i) == '1') {
					arr[1][6 - b.length() + i] = '1';
				}
			}

			for (int i = 0; i < c.length(); i++) {
				if (c.charAt(i) == '1') {
					arr[2][6 - c.length() + i] = '1';
				}
			}

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 3; j++) {
					sb.append(arr[j][i]);
				}
			}
			sb.append(' ');

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 6; j++) {
					sb.append(arr[i][j]);
				}
			}
			sb.append('\n');
		}
		System.out.println(sb);

	}
}