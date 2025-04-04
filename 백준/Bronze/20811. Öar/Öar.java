import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a = 1;
		int b = 1;
		int c = 2;
		int d = 1;
		
		int sum = 1;
		
		while (sum < n) {
			a = b;
			b = c;
			c = a + b;
			
			sum += a;
			
			d++;
		}
		
		System.out.println(d);
	}
}