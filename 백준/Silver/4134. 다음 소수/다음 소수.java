import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean[] prime = new boolean[64000];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		prime[0] = true;
		prime[1] = true;
		int x = 2;
		while (x < 64000) {
			if (!prime[x]) {
				for (int i = x * 2; i < 64000; i += x) {
					if (!prime[i]) {
						prime[i] = true;
					}
				}
			}
			x++;
		}
		for (int i = 0; i < N; i++) {
			long n = Long.parseLong(br.readLine());
			while (true) {
				if (n < 64000) {
					if (!prime[(int) n]) {
						break;
					}
				} else {
					if (isPrime(n)) {
						break;
					}
				}
				n++;
			}
			sb.append(n).append("\n");
		}
		System.out.println(sb);
	}

	static boolean isPrime(long n) {
		if (n % 2 == 0) {
			return false;
		} else {
			int x = 3;
			while(x<64000) {
				if (!prime[x]) {
					if (n % x == 0) {
						return false;
					}
				}
				x+=2;
			}
			return true;
		}
	}
}