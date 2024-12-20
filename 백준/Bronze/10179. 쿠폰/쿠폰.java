import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			double d = Double.parseDouble(br.readLine());

			d = 0.8*d;
			
			System.out.printf("$%.2f\n",d);
		}
	}
}