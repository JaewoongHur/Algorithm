import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0 0 0 0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			double[] arr = new double[6];

			for (int i = 0; i < 6; i++) {
				arr[i] = Double.parseDouble(st.nextToken());
			}

			Arrays.sort(arr);

			double avg = (arr[1] + arr[2] + arr[3] + arr[4]) / 4;

			if ((arr[1] + arr[2] + arr[3] + arr[4]) % 4 == 0) {
				System.out.println((int) avg);
			} else {
				System.out.println(avg);
			}
		}
	}
}