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

			st = new StringTokenizer(s);

			int b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			int[] monetary = new int[b+1];

			st = new StringTokenizer(br.readLine());

			for (int i = 1; i <= b; i++) {
				monetary[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());

				int d = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());

				monetary[d] -= v;
				monetary[c] += v;
			}
			
			boolean pass = true;
			
			for(int i=1;i<=b;i++) {
				if(monetary[i] < 0) {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				System.out.println("S");
			}else {
				System.out.println("N");
			}
		}
	}
}