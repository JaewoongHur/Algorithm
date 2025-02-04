import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {

			String s;

			Stack<String> stack = new Stack<String>();

			for (int i = 0; i < 4; i++) {
				s = br.readLine();
				if (s.equals("#")) {
					return;
				}

				st = new StringTokenizer(s);
				for (int j = 0; j < 13; j++) {
					stack.add(st.nextToken());
				}
			}

			String[][] deck = new String[4][13];

			for (int i = 3; i >= 0; i--) {
				for (int j = 0; j < 13; j++) {
					deck[i][j] = stack.pop();
				}
			}

			int[] check = new int[13];

			int num = 0;

			int x = 12;
			String a;

			while (true) {
				a = deck[check[x]][x];
				check[x]++;
				num++;

				if (a.charAt(0) == 'T') {
					x = 9;
				} else if (a.charAt(0) == 'J') {
					x = 10;
				} else if (a.charAt(0) == 'Q') {
					x = 11;
				} else if (a.charAt(0) == 'K') {
					x = 12;
				} else if (a.charAt(0) == 'A') {
					x = 0;
				} else {
					x = a.charAt(0) - '0' - 1;
				}

				if (check[x] == 4) {
					System.out.println(String.valueOf(num / 10) + String.valueOf(num % 10) + "," + a);
					break;
				}
			}
		}
	}
}