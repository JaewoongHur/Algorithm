import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int num2 = factorialTwo(n) - factorialTwo(m) - factorialTwo(n-m);
		int num5 = factorialFive(n) - factorialFive(m) -factorialFive(n-m);
		int ans = Math.min(num2, num5);
		System.out.println(ans);
	}

	public static int factorialTwo(int n) {
		int k = 1;
		int sum = 0;
		while (n >= Math.pow(2, k)) {
			sum += n / Math.pow(2, k);
			k++;
		}
		
		return sum;
	}
	public static int factorialFive(int n) {
		
		int k = 1;
		int sum = 0;
		while (n >= Math.pow(5, k)) {
			sum += n / Math.pow(5, k);
			k++;
		}
		
		return sum;
	}

}