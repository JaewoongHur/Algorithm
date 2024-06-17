import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());

			int[] arr = new int[n];

			for (int i = 1; i <= n - 1; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			String[] subway = new String[n];

			int a = 0;
			int b = 0;

			for (int i = 0; i < n; i++) {
				subway[i] = br.readLine();
			}
			String s = br.readLine();
			for (int i = 0; i < n; i++) {
				if(s.equals(subway[i])) {
					a = i;
				}
			}
			s = br.readLine();
			for (int i = 0; i < n; i++) {
				if(s.equals(subway[i])) {
					b = i;
				}
			}
			System.out.println("Data Set " + tc + ":");
			System.out.println(arr[Math.abs(a - b)]);
			System.out.println();
		}
	}
}