import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int X = 0;
		int Y = 0;

		String x = "";
		String y = "";

		for (int i = 0; i < a; i++) {
			x += "1";
		}

		for (int i = 0; i < b; i++) {
			y += "1";
		}

		X = Integer.parseInt(x);
		Y = Integer.parseInt(y);

		System.out.println(X + Y);

	}
}