import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		boolean[] button = new boolean[10];
		if (M > 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				int a = Integer.parseInt(st.nextToken());
				button[a] = true;
			}
		}

		int min = Math.abs(N - 100);

		int upper = N;
		int lower = N;

		while (true) {
			lower--;
			if (lower < 0) {
				break;
			}
			
			int tmp = lower;
			while (tmp > 0) {
				int c = tmp % 10;
				if (button[c]) {
					break;
				}
				tmp /= 10;
			}
			if (tmp == 0) {
				if(lower==0) {
					if(!button[0]) {
						min = Math.min(min, 1+N);
					}
				}
				else {
				int k = (int) Math.log10(lower) + 1;
				min = Math.min(min, N - lower + k);
				break;
				}
			}
		}
		
		while (true) {
			if (min < upper - N) {
				break;
			}
			int tmp = upper;
			while (tmp > 0) {
				int c = tmp % 10;
				if (button[c]) {
					break;
				}
				tmp /= 10;
			}
			if (tmp == 0) {
				if (upper == 0) {
					if (!button[0]) {
						min = Math.min(min, 1);
						break;
					}
				} else {
					int k = (int) Math.log10(upper) + 1;
					min = Math.min(min, k + upper - N);
					break;
				}
			}
			upper++;
		}

		System.out.println(min);
	}
}