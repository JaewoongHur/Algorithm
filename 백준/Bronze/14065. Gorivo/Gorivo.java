import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double a = Double.parseDouble(br.readLine());

		a = 1609.344 * a /3.785411784;
		
		a = 100000/a;
		System.out.println(a);
		
	}
}