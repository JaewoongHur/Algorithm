import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		char b = st.nextToken().charAt(0);

		int num = 0;

		for (int i = 0; i < 4 * n; i++) {
			String s = br.readLine();
			char x = s.charAt(0);
			char y = s.charAt(1);

			if (y == b) {
				switch (x) {
					case 'A':
						num += 11;
						break;
					case 'K':
						num += 4;
						break;
					case 'Q':
						num += 3;
						break;
					case 'J':
						num += 20;
						break;
					case 'T':
						num += 10;
						break;
					case '9':
						num += 14;
						break;
				}

			} else {
				switch (x) {
					case 'A':
						num += 11;
						break;
					case 'K':
						num += 4;
						break;
					case 'Q':
						num += 3;
						break;
					case 'J':
						num += 2;
						break;
					case 'T':
						num += 10;
						break;
				}
			}

		}
		System.out.println(num);
	}
}
