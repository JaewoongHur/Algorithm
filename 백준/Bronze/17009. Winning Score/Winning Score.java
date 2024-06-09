import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a1 = Integer.parseInt(br.readLine());
		int a2 = Integer.parseInt(br.readLine());
		int a3 = Integer.parseInt(br.readLine());

		int b1 = Integer.parseInt(br.readLine());
		int b2 = Integer.parseInt(br.readLine());
		int b3 = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 0;

		a = a1 * 3 + a2 * 2 + a3;
		b = b1 * 3 + b2 * 2 + b3;
		
		if(a>b) {
			System.out.println("A");
		}else if(a==b) {
			System.out.println("T");
		}else {
			System.out.println("B");
		}
	}
}