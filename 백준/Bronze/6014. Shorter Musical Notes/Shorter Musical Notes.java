import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		int[] arr = new int[a];

		int sum = 0;
		for (int i = 0; i < a; i++) {
			int x = Integer.parseInt(br.readLine());
			sum += x;
			arr[i] = sum;
		}

		for (int i = 0; i < b; i++) {
			int t = Integer.parseInt(br.readLine());

			for (int j = 0; j < a; j++) {
				if (t < arr[j]) {
					System.out.println(j + 1);
					break;
				}
			}
		}
	}
}