import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		String[] arr = new String[] { "B", "C", "B", "C", "D", "C", "D", "A", "D", "A", "B", "A" };

		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			if (n == 1) {
				System.out.println("A");
			} else {
				System.out.println(arr[(n-2)%12]);
			}
		}
	}
}