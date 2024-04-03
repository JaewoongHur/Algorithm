import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;
		while (true) {
			s = br.readLine();
			if (s.equals("0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int b = Integer.parseInt(st.nextToken());
			double n = Double.parseDouble(st.nextToken());

			int a = (int) Math.pow(b, 1 / n);

			int x = Math.abs(b - ((int) Math.pow(a, n)));
			int y = Math.abs(b - (int) Math.pow(a + 1, n));
			
			if(x<=y) {
				System.out.println(a);
			}else {
				System.out.println(a+1);
			}
		}
	}
}