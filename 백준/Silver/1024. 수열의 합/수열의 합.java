import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int x = 0;
		boolean check = false;
		while (L <= 100) {
			x = (2 * N + L - L * L) / (2 * L);
			
			if(x>=0 && (L*(2*x+L-1))/2 == N) {
				check = true;
				break;
			}
			L++;	
		}
		if (check) {
			for (int i = 0; i < L; i++) {
				sb.append(x + i).append(' ');
			}
			System.out.println(sb);
		} else {
			System.out.println(-1);
		}
	}
}