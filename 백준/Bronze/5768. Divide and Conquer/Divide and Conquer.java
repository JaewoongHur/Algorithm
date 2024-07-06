import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] arr = new int[5001];

		for (int i = 1; i < 5001; i++) {
			int t = 1;
			int cnt = 0;
			while (t <= i) {
				if (i % t == 0) {
					cnt++;
				}
				t++;
			}
			arr[i] = cnt;
		}
		String s;
		while (true) {
			s = br.readLine();
			if (s.equals("0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int x = 0;
			int y = 0;

			for (int i = a; i <= b; i++) {
				if (arr[i] >= y) {
					x = i;
					y = arr[i];
				}
			}
			System.out.println(x + " " + y);
		}
	}
}