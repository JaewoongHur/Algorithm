import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine());

			st = new StringTokenizer(br.readLine());

			int torque = 0;

			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(st.nextToken());

				torque += a;
			}

			if (torque > 0) {
				System.out.println("Right");
			} else if (torque == 0) {
				System.out.println("Equilibrium");
			} else {
				System.out.println("Left");
			}
		}
	}
}