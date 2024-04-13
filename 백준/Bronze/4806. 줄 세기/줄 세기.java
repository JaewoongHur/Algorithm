import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		int k = 0;
		while (true) {
			s = br.readLine();

			if (s == null) {
				break;
			}
			k++;
		}
		System.out.println(k);
	}
}