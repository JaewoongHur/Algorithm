import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");

		String a = s[0];
		String b = s[1];

		if (a.equals(b)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}