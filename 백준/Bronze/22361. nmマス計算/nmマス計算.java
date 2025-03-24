import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();
			if (s.equals("0 0")) {
				break;
			}

			int[] num = new int[10];

			st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[] a = new int[n];
			int[] b = new int[m];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int c = a[i] * b[j];

					String d = String.valueOf(c);

					for (int k = 0; k < d.length(); k++) {
						num[d.charAt(k)-'0']++;
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<10;i++) {
				sb.append(num[i]+" ");
			}
			System.out.println(sb);
		}
	}
}