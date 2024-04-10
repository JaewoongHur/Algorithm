import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;

		int t = 1;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			sb.append(t).append(". ");

			int n0 = Integer.parseInt(s);

			int n1 = 3 * n0;

			int n2 = 0;
			int n3 = 0;
			int n4 = 0;

			if (n1 % 2 == 0) {
				sb.append("even ");
				n2 = n1 / 2;
				n3 = 3 * n2;
				n4 = n3 / 9;
			} else {
				sb.append("odd ");
				n2 = (n1 + 1) / 2;
				n3 = 3 * n2;
				n4 = n3 / 9;
			}
			
			sb.append(n4).append('\n');
			
			t++;
		}
		System.out.println(sb);
	}
}