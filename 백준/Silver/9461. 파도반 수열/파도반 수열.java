import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int i =0 ; i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(wave(N)).append("\n");
		}
		System.out.println(sb);
	}

	static long wave(int n) {
		if (n == 1 || n == 2 || n == 3) {
			return 1;
		} else if (n == 4 || n == 5) {
			return 2;
		} else {
			long fn5 = 1;
			long fn4 = 1;
			long fn3 = 1;
			long fn2 = 2;
			long fn1 = 2;
			long fn = 0;
			for (int i = 6; i <= n; i++) {
				fn = fn1 + fn5;
				fn5 = fn4;
				fn4 = fn3;
				fn3 = fn2;
				fn2 = fn1;
				fn1 = fn;
			}
			return fn;
		}
	}
}