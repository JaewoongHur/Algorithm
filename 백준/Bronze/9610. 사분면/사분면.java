import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;
		int axis = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 || b == 0) {
				axis++;
			} else if (a > 0 && b > 0) {
				q1++;
			} else if (a < 0 && b > 0) {
				q2++;
			} else if (a < 0 && b < 0) {
				q3++;
			} else if (a > 0 && b < 0) {
				q4++;
			}

		}

		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + axis);
	}
}