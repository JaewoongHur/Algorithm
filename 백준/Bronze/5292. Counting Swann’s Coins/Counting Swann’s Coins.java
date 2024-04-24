import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine().trim());
		int a = 1;
		while (a <= n) {
			if (a % 3 == 0 && a % 5 == 0) {
				sb.append("DeadMan").append('\n');
				a++;
				continue;
			}

			if (a % 3 == 0) {
				sb.append("Dead").append('\n');
				a++;
				continue;
			}

			if (a % 5 == 0) {
				sb.append("Man").append('\n');
				a++;
				continue;
			}

			sb.append(a).append(' ');
			a++;
		}

		System.out.println(sb);
	}
}