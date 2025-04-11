import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int n = s.length();

		String a = s.substring(0, n / 2);
		String b = s.substring(n / 2, n);

		System.out.println(a + " " + b);

	}
}