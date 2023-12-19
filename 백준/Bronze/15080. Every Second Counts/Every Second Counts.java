import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " :");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " :");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());

		if (x < a) {
			x += 24;
		} else if (x == a) {
			if (y < b) {
				x += 24;
			} else if (y == b) {
				if (z < c) {
					x += 24;
				}
			}
		}

		int sum = 0;

		sum = x * 3600 + y * 60 + z - (a * 3600 + b * 60 + c);

		System.out.println(sum);

	}
}