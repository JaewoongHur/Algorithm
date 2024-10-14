import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			System.out.print("Case #" +tc +": "); 
			
			if( a + b <= c || b +c <=a || c+a<=b) {
				System.out.println("invalid!");
			} else if (a == b && b == c) {
				System.out.println("equilateral");
			} else if (a == b || b == c || c == a) {
				System.out.println("isosceles");
			} else {
				System.out.println("scalene");
			}
		}
	}
}