import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int countSelf = 0;
	static int countDp = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		fib(n);
		fibonacci(n);
		System.out.println(countSelf + " " + countDp);
	}

	static int fib(int n) {
		if (n == 1 || n == 2) {
			countSelf++;
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	static int fibonacci(int n) {
		int fn1 = 1;
		int fn2 = 1;
		int fn = 0;
		for (int i = 3; i <= n; i++) {
			countDp++;
			fn = fn1 + fn2;
			fn2 = fn1;
			fn1 = fn;
		}
		return fn;
	}

}