import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String s;
		while (!(s = br.readLine()).equals("0 0 0")) {
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (a + b > c && a + c > b && b + c > a) {
				if (a == b && b == c && c == a) {
					sb.append("Equilateral").append("\n");
				} else if (a == b || b == c || c == a) {
					sb.append("Isosceles").append("\n");
				} else {
					sb.append("Scalene").append("\n");
				}
			}
			else {
				sb.append("Invalid").append("\n");
			}
		}
		System.out.println(sb);
	}
}