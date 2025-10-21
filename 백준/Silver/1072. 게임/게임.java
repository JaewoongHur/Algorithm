import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		double x = Double.parseDouble(st.nextToken());
		double y = Double.parseDouble(st.nextToken());

		double z = Math.floor(y * 100 / x);

		if (z == 100 || z == 99) {
			System.out.println(-1);
		} else {
			if ((x + x * z - 100 * y) % (99 - z) == 0) {
				System.out.println((long) ((x + x * z - 100 * y) / (99 - z)));
			} else {
				System.out.println((long) ((x + x * z - 100 * y) / (99 - z)) + 1);
			}
		}
	}
}