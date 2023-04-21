import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			a = a % 10;

			switch (a) {
			case 0:
				sb.append(10).append('\n');
				break;

			case 1:
				sb.append(1).append('\n');
				break;
			case 2:
				switch (b % 4) {
				case 0:
					sb.append(6).append('\n');
					break;

				case 1:
					sb.append(2).append('\n');
					break;

				case 2:
					sb.append(4).append('\n');
					break;
				case 3:
					sb.append(8).append('\n');
					break;
				}
				break;
			case 3:
				switch (b % 4) {
				case 0:
					sb.append(1).append('\n');
					break;

				case 1:
					sb.append(3).append('\n');
					break;

				case 2:
					sb.append(9).append('\n');
					break;
				case 3:
					sb.append(7).append('\n');
					break;
				}
				break;
			case 4:
				switch (b % 2) {
				case 0:
					sb.append(6).append('\n');
					break;

				case 1:
					sb.append(4).append('\n');
					break;
				}
				break;
			case 5:
				sb.append(5).append('\n');
				break;
			case 6:
				sb.append(6).append('\n');
				break;
			case 7:
				switch (b % 4) {
				case 0:
					sb.append(1).append('\n');
					break;

				case 1:
					sb.append(7).append('\n');
					break;

				case 2:
					sb.append(9).append('\n');
					break;
				case 3:
					sb.append(3).append('\n');
					break;
				}
				break;
			case 8:
				switch (b%4) {
				case 0:
					sb.append(6).append('\n');
					break;
					
				case 1:
					sb.append(8).append('\n');
					break;
					
				case 2:
					sb.append(4).append('\n');
					break;
				case 3:
					sb.append(2).append('\n');
					break;
				}
				break;
			case 9:
				switch (b%2) {
				case 0:
					sb.append(1).append('\n');
					break;
					
				case 1:
					sb.append(9).append('\n');
					break;
				}
				break;

			}

		}
		System.out.println(sb);
	}
}