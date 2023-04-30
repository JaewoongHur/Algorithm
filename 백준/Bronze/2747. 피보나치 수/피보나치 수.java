import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		System.out.println(fibo(n));
	}

	private static long fibo(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i=3;i<=n;i++) {
			c = a + b;
			a = b;
			b = c;			
		}
		return c;
	}

}