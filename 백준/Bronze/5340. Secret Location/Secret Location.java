import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[6];

		for (int i = 0; i < 6; i++) {
			String s = br.readLine().trim();

			arr[i] = s.length();
		}

		System.out.println("Latitude " + arr[0] + ":" + arr[1] + ":" + arr[2]);
		System.out.println("Longitude " + arr[3] + ":" + arr[4] + ":" + arr[5]);

	}
}