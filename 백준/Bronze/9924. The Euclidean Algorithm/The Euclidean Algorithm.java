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

		int n = 0;

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		while (b != 0) {
			n += a / b;
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		System.out.println(n - 1);
	}
}