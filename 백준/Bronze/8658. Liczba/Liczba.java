import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 0;

		for (int i = 2; i < n; i++) {

			if (n % i != 0) {
				a = i;
				break;
			}
		}
		
		for(int i = n-1; i>=2; i--) {
			if (n % i != 0) {
				b = i;
				break;
			}
			
		}
		System.out.println(a + " " + b);
	}
}