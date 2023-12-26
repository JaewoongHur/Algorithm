import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int a = Integer.parseInt(st.nextToken());

		int pa = Integer.parseInt(st.nextToken());

		int b = Integer.parseInt(st.nextToken());

		int pb = Integer.parseInt(st.nextToken());

		int min = 0;
		int x = 0;
		int y = 0;

		if (n % a == 0) {
			x = n / a;
		} else {
			x = n / a + 1;
		}

		if (n % b == 0) {
			y = n / b;
		} else {
			y = n / b + 1;
		}
		
		min = Math.min(pa*x, pb*y);
		
		System.out.println(min);
	}
}