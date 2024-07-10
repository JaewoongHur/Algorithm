import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		
		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			boolean[] arr = new boolean[10000];

			int a = Integer.parseInt(s);

			arr[a] = true;

			int b = 0;

			while (true) {

				b = a * a;

				String c = String.valueOf(b);

				while(c.length()<8) {
					c = "0" + c;
				}
				
				b = Integer.parseInt(c.substring(2, 6));
				
				if (arr[b]) {
					break;
				}

				arr[b] = true;
				a = b;
			}

			int cnt = 0;

			for (int i = 0; i < 10000; i++) {
				if (arr[i]) {
					cnt++;
				}
			}
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
	}
}