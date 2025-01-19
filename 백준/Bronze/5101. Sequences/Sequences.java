import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();
			if (s.equals("0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if ((c - a) % b == 0) {
				if ((c - a) / b + 1 <= 0) {
					System.out.println("X");
				} else {
					System.out.println((c - a) / b + 1);
				}
			} else {
				System.out.println("X");
			}
		}
	}
}